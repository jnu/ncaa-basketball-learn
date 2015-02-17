/**
 * March Madness deep learning with Spark
 */

import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf

/**
 * Run
 */
object Learn {

    def main(args: Array[String]) {
        run()
    }

    def run() {
        val conf = new SparkConf().setAppName("March Madness deep learning")
        val sc = new SparkContext(conf)


        /* do stuff */

        sc.stop()
    }

}
