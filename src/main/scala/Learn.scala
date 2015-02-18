/**
 * NCAA Basketball deep learning experiments with Spark
 */

import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf
import org.apache.spark.h2o.H2OContext
import noodlebot.util.SparkUtil._
import noodlebot.schema.TeamSummary

/**
 * Run
 */
object Learn {

    def main(args: Array[String]) {
        run()
    }

    def run() {
        // Create a Spark context
        val conf = new SparkConf().setAppName("March Madness deep learning")
        val sc = new SparkContext(conf)

        // Create an h2o context inside the Spark context
        val h2oContext = new H2OContext(sc).start();
        import h2oContext._

        // Load source files
        loadTSV(sc, TeamSummary.parse, "data/2013_summary_team_data.tsv")

        sc.stop()
    }

}
