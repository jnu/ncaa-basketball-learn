/**
 * NCAA Basketball deep learning experiments with Spark
 */

import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf
import org.apache.spark.rdd.RDD
import org.apache.spark.h2o.H2OContext
import org.apache.spark.sql.SQLContext
import hex.deeplearning.DeepLearning
import hex.deeplearning.DeepLearningModel.DeepLearningParameters
import hex.deeplearning.DeepLearningModel.DeepLearningParameters.Activation
//import org.apache.spark.examples.h2o.DemoUtils.residualPlotRCode
import noodlebot.util.SparkUtil._
import noodlebot.schema.MergedGameData
import water.fvec.DataFrame
import java.io.File

/**
 * Run
 */
object Learn {

    def getSparkContext(): SparkContext = {
        val conf = new SparkConf().setAppName("NCAA basketball deep learning")
        new SparkContext(conf)
    }

    def getH2OContext(sc: SparkContext): H2OContext = {
        // Create an h2o context inside the Spark context
        new H2OContext(sc).start();
    }

    def stopSpark(sc: SparkContext): Unit = sc.stop()

    def main(args: Array[String]): Unit = {
        val sc: SparkContext = getSparkContext()
        val h2oContext: H2OContext = getH2OContext(sc)
        runInContext(sc, h2oContext, args(1))
        stopSpark(sc)
    }

    def runInContext(sc: SparkContext, h2oContext: H2OContext, sourceFile: String): Unit = {
        import h2oContext._

        // Load source file
        val dataTable: RDD[MergedGameData] = loadCSVAsRDD[MergedGameData](
            sc,
            sourceFile,
            MergedGameData.parse
        )

        // Load sql context
        implicit val sqlContext = new SQLContext(sc)
        import sqlContext._

        // Implicit conversion to DataFrame
        val dataFrame: DataFrame = dataTable

        val dlParams = new DeepLearningParameters()
        dlParams._train = dataFrame
        dlParams._response_column = 'HERO_TEAM_POINTS
        dlParams._epochs = 5
        dlParams._activation = Activation.RectifierWithDropout
        dlParams._hidden = Array[Int](100, 100)

        // Create DeepLearning model
        val dl = new DeepLearning(dlParams)
        // Submit spark job
        val dlModel = dl.trainModel.get

        val predictionFrame = dlModel.score(dataTable)('predict)
        val predictionsFromModel = asSchemaRDD(predictionFrame).collect.map(row => {
            if (row.isNullAt(0)) Double.NaN else row(0)
        })

        // // Generate R plot code
        // val plot = residualPlotRCode(predictionFrame, 'predict, dataTable, 'HERO_TEAM_POINTS)

    }

}
