/**
 * TeamSummary class and associated parser
 */

package noodlebot.schema

import noodlebot.util.conversions._


/**
 * Schema to hold data summarizing how a team performed in a given season
 *
 * TODO field for season?
 */
class TeamSummary(
  val ID              : Option[Int],
  val NAME            : Option[String],
  val MINUTES         : Option[Float],
  val FGM             : Option[Int],
  val FGA             : Option[Int],
  val FGPCT           : Option[Float],
  val THREEFGM        : Option[Int],
  val THREEFGA        : Option[Int],
  val THREEFGPCT      : Option[Float],
  val FT              : Option[Int],
  val FTA             : Option[Int],
  val FTPCT           : Option[Float],
  val PTS             : Option[Int],
  val PTSAVG          : Option[Float],
  val OFFREB          : Option[Int],
  val DEFREB          : Option[Int],
  val TOTREB          : Option[Int],
  val REBAVG          : Option[Float],
  val AST             : Option[Int],
  val TO              : Option[Int],
  val STL             : Option[Int],
  val BLK             : Option[Int],
  val FOULS           : Option[Int],
  val DBLDBL          : Option[Int],
  val TRPDBL          : Option[Int],
  val OPP_MINUTES     : Option[Float],
  val OPP_FGM         : Option[Int],
  val OPP_FGA         : Option[Int],
  val OPP_FGPCT       : Option[Float],
  val OPP_THREE_FGM   : Option[Int],
  val OPP_THREE_FGA   : Option[Int],
  val OPP_THREE_FGPCT : Option[Float],
  val OPP_FT          : Option[Int],
  val OPP_FTA         : Option[Int],
  val OPP_FTPCT       : Option[Float],
  val OPP_PTS         : Option[Int],
  val OPP_PTSAVG      : Option[Float],
  val OPP_OFFREB      : Option[Int],
  val OPP_DEFREB      : Option[Int],
  val OPP_TOTREB      : Option[Int],
  val OPP_REBAVG      : Option[Float],
  val OPP_AST         : Option[Int],
  val OPP_TO          : Option[Int],
  val OPP_STL         : Option[Int],
  val OPP_BLK         : Option[Int],
  val OPP_FOULS       : Option[Int],
  val OPP_DBLDBL      : Option[Int],
  val OPP_TRPDBL      : Option[Int]
) extends Schema with Serializable


/**
 * Static parser method for the TeamSummary schema
 */
object TeamSummary extends Serializable {

  def parse(parts: Array[String]): TeamSummary = {
    new TeamSummary(
      int    (parts( 0)),
      str    (parts( 1)),
      minutes(parts( 2)),
      int    (parts( 3)),
      int    (parts( 4)),
      float  (parts( 5)),
      int    (parts( 6)),
      int    (parts( 7)),
      float  (parts( 8)),
      int    (parts( 9)),
      int    (parts(10)),
      float  (parts(11)),
      int    (parts(12)),
      float  (parts(13)),
      int    (parts(14)),
      int    (parts(15)),
      int    (parts(16)),
      float  (parts(17)),
      int    (parts(18)),
      int    (parts(19)),
      int    (parts(20)),
      int    (parts(21)),
      int    (parts(22)),
      int    (parts(23)),
      int    (parts(24)),
      minutes(parts(25)),
      int    (parts(26)),
      int    (parts(27)),
      float  (parts(28)),
      int    (parts(29)),
      int    (parts(30)),
      float  (parts(31)),
      int    (parts(32)),
      int    (parts(33)),
      float  (parts(34)),
      int    (parts(35)),
      float  (parts(36)),
      int    (parts(37)),
      int    (parts(38)),
      int    (parts(39)),
      float  (parts(40)),
      int    (parts(41)),
      int    (parts(42)),
      int    (parts(43)),
      int    (parts(44)),
      int    (parts(45)),
      int    (parts(46)),
      int    (parts(47))
    )
  }

}
