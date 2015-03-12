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
  val HERO_TEAM_ID                    : Option[Int],
  val HERO_TEAM_NAME                  : Option[String],
  val HERO_TEAM_MINUTES               : Option[Int],
  val HERO_TEAM_FGM                   : Option[Int],
  val HERO_TEAM_FGA                   : Option[Int],
  val HERO_TEAM_FGPCT                 : Option[Float],
  val HERO_TEAM_THREE_FGM             : Option[Int],
  val HERO_TEAM_THREE_FGA             : Option[Int],
  val HERO_TEAM_THREE_FGPCT           : Option[Float],
  val HERO_TEAM_FT                    : Option[Int],
  val HERO_TEAM_FTA                   : Option[Int],
  val HERO_TEAM_FTPCT                 : Option[Float],
  val HERO_TEAM_PTS                   : Option[Int],
  val HERO_TEAM_PTSAVG                : Option[Float],
  val HERO_TEAM_OFFREB                : Option[Int],
  val HERO_TEAM_DEFREB                : Option[Int],
  val HERO_TEAM_TOTREB                : Option[Int],
  val HERO_TEAM_REBAVG                : Option[Float],
  val HERO_TEAM_AST                   : Option[Int],
  val HERO_TEAM_TO                    : Option[Int],
  val HERO_TEAM_STL                   : Option[Int],
  val HERO_TEAM_BLK                   : Option[Int],
  val HERO_TEAM_FOULS                 : Option[Int],
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
  val CHALLENGER_TEAM_ID              : Option[Int],
  val CHALLENGER_TEAM_NAME            : Option[String],
  val CHALLENGER_TEAM_MINUTES         : Option[Int],
  val CHALLENGER_TEAM_FGM             : Option[Int],
  val CHALLENGER_TEAM_FGA             : Option[Int],
  val CHALLENGER_TEAM_FGPCT           : Option[Float],
  val CHALLENGER_TEAM_THREE_FGM       : Option[Int],
  val CHALLENGER_TEAM_THREE_FGA       : Option[Int],
  val CHALLENGER_TEAM_THREE_FGPCT     : Option[Float],
  val CHALLENGER_TEAM_FT              : Option[Int],
  val CHALLENGER_TEAM_FTA             : Option[Int],
  val CHALLENGER_TEAM_FTPCT           : Option[Float],
  val CHALLENGER_TEAM_PTS             : Option[Int],
  val CHALLENGER_TEAM_PTSAVG          : Option[Float],
  val CHALLENGER_TEAM_OFFREB          : Option[Int],
  val CHALLENGER_TEAM_DEFREB          : Option[Int],
  val CHALLENGER_TEAM_TOTREB          : Option[Int],
  val CHALLENGER_TEAM_REBAVG          : Option[Float],
  val CHALLENGER_TEAM_AST             : Option[Int],
  val CHALLENGER_TEAM_TO              : Option[Int],
  val CHALLENGER_TEAM_STL             : Option[Int],
  val CHALLENGER_TEAM_BLK             : Option[Int],
  val CHALLENGER_TEAM_FOULS           : Option[Int],
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

  override def canEqual(that: Any): Boolean = that.isInstanceOf[MergedGameData]

  override def productArity: Int = 99

  override def productElement(n: Int) = n match {
    case  0 => ID
    case  1 => LOCATION
    case  2 => HERO_TEAM_POINTS
    case  3 => HERO_TEAM_ID
    case  4 => HERO_TEAM_NAME
    case  5 => HERO_TEAM_MINUTES
    case  6 => HERO_TEAM_FGM
    case  7 => HERO_TEAM_FGA
    case  8 => HERO_TEAM_FGPCT
    case  9 => HERO_TEAM_THREE_FGM
    case 10 => HERO_TEAM_THREE_FGA
    case 11 => HERO_TEAM_THREE_FGPCT
    case 12 => HERO_TEAM_FT
    case 13 => HERO_TEAM_FTA
    case 14 => HERO_TEAM_FTPCT
    case 15 => HERO_TEAM_PTS
    case 16 => HERO_TEAM_PTSAVG
    case 17 => HERO_TEAM_OFFREB
    case 18 => HERO_TEAM_DEFREB
    case 19 => HERO_TEAM_TOTREB
    case 20 => HERO_TEAM_REBAVG
    case 21 => HERO_TEAM_AST
    case 22 => HERO_TEAM_TO
    case 23 => HERO_TEAM_STL
    case 24 => HERO_TEAM_BLK
    case 25 => HERO_TEAM_FOULS
    case 26 => HERO_TEAM_DBLDBL
    case 27 => HERO_TEAM_TRPDBL
    case 28 => HERO_OPP_TEAM_MINUTES
    case 29 => HERO_OPP_TEAM_FGM
    case 30 => HERO_OPP_TEAM_FGA
    case 31 => HERO_OPP_TEAM_FGPCT
    case 32 => HERO_OPP_TEAM_THREE_FGM
    case 33 => HERO_OPP_TEAM_THREE_FGA
    case 34 => HERO_OPP_TEAM_THREE_FGPCT
    case 35 => HERO_OPP_TEAM_FT
    case 36 => HERO_OPP_TEAM_FTA
    case 37 => HERO_OPP_TEAM_FTPCT
    case 38 => HERO_OPP_TEAM_PTS
    case 39 => HERO_OPP_TEAM_PTSAVG
    case 40 => HERO_OPP_TEAM_OFFREB
    case 41 => HERO_OPP_TEAM_DEFREB
    case 42 => HERO_OPP_TEAM_TOTREB
    case 43 => HERO_OPP_TEAM_REBAVG
    case 44 => HERO_OPP_TEAM_AST
    case 45 => HERO_OPP_TEAM_TO
    case 46 => HERO_OPP_TEAM_STL
    case 47 => HERO_OPP_TEAM_BLK
    case 48 => HERO_OPP_TEAM_FOULS
    case 49 => HERO_OPP_TEAM_DBLDBL
    case 50 => HERO_OPP_TEAM_TRPDBL
    case 51 => CHALLENGER_TEAM_ID
    case 52 => CHALLENGER_TEAM_NAME
    case 53 => CHALLENGER_TEAM_MINUTES
    case 54 => CHALLENGER_TEAM_FGM
    case 55 => CHALLENGER_TEAM_FGA
    case 56 => CHALLENGER_TEAM_FGPCT
    case 57 => CHALLENGER_TEAM_THREE_FGM
    case 58 => CHALLENGER_TEAM_THREE_FGA
    case 59 => CHALLENGER_TEAM_THREE_FGPCT
    case 60 => CHALLENGER_TEAM_FT
    case 61 => CHALLENGER_TEAM_FTA
    case 62 => CHALLENGER_TEAM_FTPCT
    case 63 => CHALLENGER_TEAM_PTS
    case 64 => CHALLENGER_TEAM_PTSAVG
    case 65 => CHALLENGER_TEAM_OFFREB
    case 66 => CHALLENGER_TEAM_DEFREB
    case 67 => CHALLENGER_TEAM_TOTREB
    case 68 => CHALLENGER_TEAM_REBAVG
    case 69 => CHALLENGER_TEAM_AST
    case 70 => CHALLENGER_TEAM_TO
    case 71 => CHALLENGER_TEAM_STL
    case 72 => CHALLENGER_TEAM_BLK
    case 73 => CHALLENGER_TEAM_FOULS
    case 74 => CHALLENGER_TEAM_DBLDBL
    case 75 => CHALLENGER_TEAM_TRPDBL
    case 76 => CHALLENGER_OPP_TEAM_MINUTES
    case 77 => CHALLENGER_OPP_TEAM_FGM
    case 78 => CHALLENGER_OPP_TEAM_FGA
    case 79 => CHALLENGER_OPP_TEAM_FGPCT
    case 80 => CHALLENGER_OPP_TEAM_THREE_FGM
    case 81 => CHALLENGER_OPP_TEAM_THREE_FGA
    case 82 => CHALLENGER_OPP_TEAM_THREE_FGPCT
    case 83 => CHALLENGER_OPP_TEAM_FT
    case 84 => CHALLENGER_OPP_TEAM_FTA
    case 85 => CHALLENGER_OPP_TEAM_FTPCT
    case 86 => CHALLENGER_OPP_TEAM_PTS
    case 87 => CHALLENGER_OPP_TEAM_PTSAVG
    case 88 => CHALLENGER_OPP_TEAM_OFFREB
    case 89 => CHALLENGER_OPP_TEAM_DEFREB
    case 90 => CHALLENGER_OPP_TEAM_TOTREB
    case 91 => CHALLENGER_OPP_TEAM_REBAVG
    case 92 => CHALLENGER_OPP_TEAM_AST
    case 93 => CHALLENGER_OPP_TEAM_TO
    case 94 => CHALLENGER_OPP_TEAM_STL
    case 95 => CHALLENGER_OPP_TEAM_BLK
    case 96 => CHALLENGER_OPP_TEAM_FOULS
    case 97 => CHALLENGER_OPP_TEAM_DBLDBL
    case 98 => CHALLENGER_OPP_TEAM_TRPDBL
    case  _ => throw new IndexOutOfBoundsException(n.toString)
  }

  override def toString: String = {
    val sb = new StringBuffer
    for (i <- 0 until productArity)
      sb.append(productElement(i)).append(',')
    sb.toString
  }

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
      int   (parts( 3)),
      string(parts( 4)),
      int   (parts( 5)),
      int   (parts( 6)),
      int   (parts( 7)),
      float (parts( 8)),
      int   (parts( 9)),
      int   (parts(10)),
      float (parts(11)),
      int   (parts(12)),
      int   (parts(13)),
      float (parts(14)),
      int   (parts(15)),
      float (parts(16)),
      int   (parts(17)),
      int   (parts(18)),
      int   (parts(19)),
      float (parts(20)),
      int   (parts(21)),
      int   (parts(22)),
      int   (parts(23)),
      int   (parts(24)),
      int   (parts(25)),
      int   (parts(26)),
      int   (parts(27)),
      int   (parts(28)),
      int   (parts(29)),
      int   (parts(30)),
      float (parts(31)),
      int   (parts(32)),
      int   (parts(33)),
      float (parts(34)),
      int   (parts(35)),
      int   (parts(36)),
      float (parts(37)),
      int   (parts(38)),
      float (parts(39)),
      int   (parts(40)),
      int   (parts(41)),
      int   (parts(42)),
      float (parts(43)),
      int   (parts(44)),
      int   (parts(45)),
      int   (parts(46)),
      int   (parts(47)),
      int   (parts(48)),
      int   (parts(49)),
      int   (parts(50)),
      int   (parts(51)),
      string(parts(52)),
      int   (parts(53)),
      int   (parts(54)),
      int   (parts(55)),
      float (parts(56)),
      int   (parts(57)),
      int   (parts(58)),
      float (parts(59)),
      int   (parts(60)),
      int   (parts(61)),
      float (parts(62)),
      int   (parts(63)),
      float (parts(64)),
      int   (parts(65)),
      int   (parts(66)),
      int   (parts(67)),
      float (parts(68)),
      int   (parts(69)),
      int   (parts(70)),
      int   (parts(71)),
      int   (parts(72)),
      int   (parts(73)),
      int   (parts(74)),
      int   (parts(75)),
      int   (parts(76)),
      int   (parts(77)),
      int   (parts(78)),
      float (parts(79)),
      int   (parts(80)),
      int   (parts(81)),
      float (parts(82)),
      int   (parts(83)),
      int   (parts(84)),
      float (parts(85)),
      int   (parts(86)),
      float (parts(87)),
      int   (parts(88)),
      int   (parts(89)),
      int   (parts(90)),
      float (parts(91)),
      int   (parts(92)),
      int   (parts(93)),
      int   (parts(94)),
      int   (parts(95)),
      int   (parts(96)),
      int   (parts(97)),
      int   (parts(98))
    )
  }

}
