/**
 * MergedGameData schema and associated parser
 */

package noodlebot.schema

import noodlebot.util.conversions._


/**
 * Schema to hold a record of merged game + team summary data
 */
class MergedGameData(
  val ID                              : Option[String],
  val LOCATION                        : Option[Int],
  val HERO_TEAM_POINTS                : Option[Int],
  val HERO_TEAM_FGPCT                 : Option[Float],
  val HERO_TEAM_THREE_FGPCT           : Option[Float],
  val HERO_TEAM_FTPCT                 : Option[Float],
  val HERO_TEAM_PTSAVG                : Option[Float],
  val HERO_TEAM_REBAVG                : Option[Float],
  val HERO_TEAM_DBLDBL                : Option[Int],
  val HERO_TEAM_TRPDBL                : Option[Int],
  val HERO_OPP_TEAM_MINUTES           : Option[Int],
  val HERO_OPP_TEAM_FGM               : Option[Int],
  val HERO_OPP_TEAM_FGA               : Option[Int],
  val HERO_OPP_TEAM_FGPCT             : Option[Float],
  val HERO_OPP_TEAM_THREE_FGM         : Option[Int],
  val HERO_OPP_TEAM_THREE_FGA         : Option[Int],
  val HERO_OPP_TEAM_THREE_FGPCT       : Option[Float],
  val HERO_OPP_TEAM_FT                : Option[Int],
  val HERO_OPP_TEAM_FTA               : Option[Int],
  val HERO_OPP_TEAM_FTPCT             : Option[Float],
  val HERO_OPP_TEAM_PTS               : Option[Int],
  val HERO_OPP_TEAM_PTSAVG            : Option[Float],
  val HERO_OPP_TEAM_OFFREB            : Option[Int],
  val HERO_OPP_TEAM_DEFREB            : Option[Int],
  val HERO_OPP_TEAM_TOTREB            : Option[Int],
  val HERO_OPP_TEAM_REBAVG            : Option[Float],
  val HERO_OPP_TEAM_AST               : Option[Int],
  val HERO_OPP_TEAM_TO                : Option[Int],
  val HERO_OPP_TEAM_STL               : Option[Int],
  val HERO_OPP_TEAM_BLK               : Option[Int],
  val HERO_OPP_TEAM_FOULS             : Option[Int],
  val HERO_OPP_TEAM_DBLDBL            : Option[Int],
  val HERO_OPP_TEAM_TRPDBL            : Option[Int],
  val CHALLENGER_TEAM_FGPCT           : Option[Float],
  val CHALLENGER_TEAM_THREE_FGPCT     : Option[Float],
  val CHALLENGER_TEAM_FTPCT           : Option[Float],
  val CHALLENGER_TEAM_PTSAVG          : Option[Float],
  val CHALLENGER_TEAM_REBAVG          : Option[Float],
  val CHALLENGER_TEAM_DBLDBL          : Option[Int],
  val CHALLENGER_TEAM_TRPDBL          : Option[Int],
  val CHALLENGER_OPP_TEAM_MINUTES     : Option[Int],
  val CHALLENGER_OPP_TEAM_FGM         : Option[Int],
  val CHALLENGER_OPP_TEAM_FGA         : Option[Int],
  val CHALLENGER_OPP_TEAM_FGPCT       : Option[Float],
  val CHALLENGER_OPP_TEAM_THREE_FGM   : Option[Int],
  val CHALLENGER_OPP_TEAM_THREE_FGA   : Option[Int],
  val CHALLENGER_OPP_TEAM_THREE_FGPCT : Option[Float],
  val CHALLENGER_OPP_TEAM_FT          : Option[Int],
  val CHALLENGER_OPP_TEAM_FTA         : Option[Int],
  val CHALLENGER_OPP_TEAM_FTPCT       : Option[Float],
  val CHALLENGER_OPP_TEAM_PTS         : Option[Int],
  val CHALLENGER_OPP_TEAM_PTSAVG      : Option[Float],
  val CHALLENGER_OPP_TEAM_OFFREB      : Option[Int],
  val CHALLENGER_OPP_TEAM_DEFREB      : Option[Int],
  val CHALLENGER_OPP_TEAM_TOTREB      : Option[Int],
  val CHALLENGER_OPP_TEAM_REBAVG      : Option[Float],
  val CHALLENGER_OPP_TEAM_AST         : Option[Int],
  val CHALLENGER_OPP_TEAM_TO          : Option[Int],
  val CHALLENGER_OPP_TEAM_STL         : Option[Int],
  val CHALLENGER_OPP_TEAM_BLK         : Option[Int],
  val CHALLENGER_OPP_TEAM_FOULS       : Option[Int],
  val CHALLENGER_OPP_TEAM_DBLDBL      : Option[Int],
  val CHALLENGER_OPP_TEAM_TRPDBL      : Option[Int]
) extends Product with Serializable {

  override def canEqual(that: Any): Boolean = that.isInstanceOf[TeamSummary]

  override def productArity: Int = 63

  override def productElement(n: Int) = n match {
    case  0 => ID
    case  1 => LOCATION
    case  2 => HERO_TEAM_POINTS
    case  3 => HERO_TEAM_FGPCT
    case  4 => HERO_TEAM_THREE_FGPCT
    case  5 => HERO_TEAM_FTPCT
    case  6 => HERO_TEAM_PTSAVG
    case  7 => HERO_TEAM_REBAVG
    case  8 => HERO_TEAM_DBLDBL
    case  9 => HERO_TEAM_TRPDBL
    case 10 => HERO_OPP_TEAM_MINUTES
    case 11 => HERO_OPP_TEAM_FGM
    case 12 => HERO_OPP_TEAM_FGA
    case 13 => HERO_OPP_TEAM_FGPCT
    case 14 => HERO_OPP_TEAM_THREE_FGM
    case 15 => HERO_OPP_TEAM_THREE_FGA
    case 16 => HERO_OPP_TEAM_THREE_FGPCT
    case 17 => HERO_OPP_TEAM_FT
    case 18 => HERO_OPP_TEAM_FTA
    case 19 => HERO_OPP_TEAM_FTPCT
    case 20 => HERO_OPP_TEAM_PTS
    case 21 => HERO_OPP_TEAM_PTSAVG
    case 22 => HERO_OPP_TEAM_OFFREB
    case 23 => HERO_OPP_TEAM_DEFREB
    case 24 => HERO_OPP_TEAM_TOTREB
    case 25 => HERO_OPP_TEAM_REBAVG
    case 26 => HERO_OPP_TEAM_AST
    case 27 => HERO_OPP_TEAM_TO
    case 28 => HERO_OPP_TEAM_STL
    case 29 => HERO_OPP_TEAM_BLK
    case 30 => HERO_OPP_TEAM_FOULS
    case 31 => HERO_OPP_TEAM_DBLDBL
    case 32 => HERO_OPP_TEAM_TRPDBL
    case 33 => CHALLENGER_TEAM_FGPCT
    case 34 => CHALLENGER_TEAM_THREE_FGPCT
    case 35 => CHALLENGER_TEAM_FTPCT
    case 36 => CHALLENGER_TEAM_PTSAVG
    case 37 => CHALLENGER_TEAM_REBAVG
    case 38 => CHALLENGER_TEAM_DBLDBL
    case 39 => CHALLENGER_TEAM_TRPDBL
    case 40 => CHALLENGER_OPP_TEAM_MINUTES
    case 41 => CHALLENGER_OPP_TEAM_FGM
    case 42 => CHALLENGER_OPP_TEAM_FGA
    case 43 => CHALLENGER_OPP_TEAM_FGPCT
    case 44 => CHALLENGER_OPP_TEAM_THREE_FGM
    case 45 => CHALLENGER_OPP_TEAM_THREE_FGA
    case 46 => CHALLENGER_OPP_TEAM_THREE_FGPCT
    case 47 => CHALLENGER_OPP_TEAM_FT
    case 48 => CHALLENGER_OPP_TEAM_FTA
    case 49 => CHALLENGER_OPP_TEAM_FTPCT
    case 50 => CHALLENGER_OPP_TEAM_PTS
    case 51 => CHALLENGER_OPP_TEAM_PTSAVG
    case 52 => CHALLENGER_OPP_TEAM_OFFREB
    case 53 => CHALLENGER_OPP_TEAM_DEFREB
    case 54 => CHALLENGER_OPP_TEAM_TOTREB
    case 55 => CHALLENGER_OPP_TEAM_REBAVG
    case 56 => CHALLENGER_OPP_TEAM_AST
    case 57 => CHALLENGER_OPP_TEAM_TO
    case 58 => CHALLENGER_OPP_TEAM_STL
    case 59 => CHALLENGER_OPP_TEAM_BLK
    case 60 => CHALLENGER_OPP_TEAM_FOULS
    case 61 => CHALLENGER_OPP_TEAM_DBLDBL
    case 62 => CHALLENGER_OPP_TEAM_TRPDBL
    case  _ => throw new IndexOutOfBoundsException(n.toString)
  }

  override def toString: String = {
    val sb = new StringBuffer
    for (i <- 0 until productArity)
      sb.append(productElement(i)).append('
')
    sb.toString
  }

  // XXX Where is this used?
  def isWrongRow: Boolean = (0 until productArity).map(idx => productElement(idx)).forall(e => e == None)

}


/**
 * Static parser method for the MergedGameData schema
 */
object MergedGameData extends Serializable {

  def parse(parts: Array[String]): MergedGameData = {
    new MergedGameData(
      string(parts( 0)),
      int   (parts( 1)),
      int   (parts( 2)),
      float (parts( 3)),
      float (parts( 4)),
      float (parts( 5)),
      float (parts( 6)),
      float (parts( 7)),
      int   (parts( 8)),
      int   (parts( 9)),
      int   (parts(10)),
      int   (parts(11)),
      int   (parts(12)),
      float (parts(13)),
      int   (parts(14)),
      int   (parts(15)),
      float (parts(16)),
      int   (parts(17)),
      int   (parts(18)),
      float (parts(19)),
      int   (parts(20)),
      float (parts(21)),
      int   (parts(22)),
      int   (parts(23)),
      int   (parts(24)),
      float (parts(25)),
      int   (parts(26)),
      int   (parts(27)),
      int   (parts(28)),
      int   (parts(29)),
      int   (parts(30)),
      int   (parts(31)),
      int   (parts(32)),
      float (parts(33)),
      float (parts(34)),
      float (parts(35)),
      float (parts(36)),
      float (parts(37)),
      int   (parts(38)),
      int   (parts(39)),
      int   (parts(40)),
      int   (parts(41)),
      int   (parts(42)),
      float (parts(43)),
      int   (parts(44)),
      int   (parts(45)),
      float (parts(46)),
      int   (parts(47)),
      int   (parts(48)),
      float (parts(49)),
      int   (parts(50)),
      float (parts(51)),
      int   (parts(52)),
      int   (parts(53)),
      int   (parts(54)),
      float (parts(55)),
      int   (parts(56)),
      int   (parts(57)),
      int   (parts(58)),
      int   (parts(59)),
      int   (parts(60)),
      int   (parts(61)),
      int   (parts(62))
    )
  }

}
