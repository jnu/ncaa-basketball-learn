/**
 * NCAA Basketball deep learning experiments with Spark
 */

import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf
import org.apache.spark.rdd.RDD
import org.apache.spark.h2o.H2OContext
import noodlebot.util.SparkUtil._
import noodlebot.schema.{Schema, TeamSummary}

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
        val h2oContext = new H2OContext(sc).start();
        import h2oContext._

        h2oContext
    }

    def stopSpark(sc: SparkContext): Unit = sc.stop()

    def main(args: Array[String]): Unit = {
        val sc: SparkContext = getSparkContext()
        val h2oContext: H2OContext = getH2OContext(sc)
        runInContext(sc, h2oContext)
        stopSpark(sc)
    }

    def runInContext(sc: SparkContext, h2oContext: H2OContext): Unit = {
        // Load source files
        val teamSummaries : Seq[RDD[TeamSummary]] = loadTSV[TeamSummary](
            sc,
            TeamSummary.parse,
            "data/2010_summary_team_data.tsv",
            "data/2011_summary_team_data.tsv",
            "data/2012_summary_team_data.tsv",
            "data/2013_summary_team_data.tsv",
            "data/2014_summary_team_data.tsv"
        )
    }

}
