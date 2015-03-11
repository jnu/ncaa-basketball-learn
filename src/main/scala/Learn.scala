/**
 * NCAA Basketball deep learning experiments with Spark
 */

import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf
import org.apache.spark.rdd.RDD
import org.apache.spark.h2o.H2OContext
import org.apache.spark.sql.SQLContext
import noodlebot.util.SparkUtil._
import noodlebot.schema.TeamSummary
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
        runInContext(sc, h2oContext)
        stopSpark(sc)
    }

    def runInContext(sc: SparkContext, h2oContext: H2OContext): Unit = {
        import h2oContext._

        // Load source files
        val summaryFiles = Array(
            "data/2010_summary_team_data.csv",
            "data/2011_summary_team_data.csv",
            "data/2012_summary_team_data.csv",
            "data/2013_summary_team_data.csv",
            "data/2014_summary_team_data.csv"
        )

        val summaryFrames: Array[DataFrame] = summaryFiles.map(fn => new DataFrame(new File(fn)))
        val summaryTables: Array[RDD[TeamSummary]] = summaryFrames.map(asRDD[TeamSummary](_))

        val sqlContext = new SQLContext(sc)
        import sqlContext._

        summaryTables.zipWithIndex.foreach{ case (table, i) => table.registerTempTable(s"summaryTable$i") }
    }

}
