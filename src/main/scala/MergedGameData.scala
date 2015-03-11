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
  val GAME_ID                         : Option[Int],
  val GAME_DATE                       : Option[java.util.Date],
  val HERO_TEAM_ID                    : Option[Int],
  val HERO_TEAM_NAME                  : Option[String],
  val HERO_TEAM_MINUTES               : Option[Int],
  val HERO_TEAM_FGM                   : Option[Int],
  val HERO_TEAM_FGA                   : Option[Int],
  val HERO_TEAM_THREE_FGM             : Option[Int],
  val HERO_TEAM_THREE_FGA             : Option[Int],
  val HERO_TEAM_FT                    : Option[Int],
  val HERO_TEAM_FTA                   : Option[Int],
  val HERO_TEAM_PTS                   : Option[Int],
  val HERO_TEAM_OFFREB                : Option[Int],
  val HERO_TEAM_DEFREB                : Option[Int],
  val HERO_TEAM_TOTREB                : Option[Int],
  val HERO_TEAM_AST                   : Option[Int],
  val HERO_TEAM_TO                    : Option[Int],
  val HERO_TEAM_STL                   : Option[Int],
  val HERO_TEAM_BLK                   : Option[Int],
  val HERO_TEAM_FOULS                 : Option[Int],
  val CHALLENGER_TEAM_ID              : Option[Int],
  val CHALLENGER_TEAM_NAME            : Option[String],
  val CHALLENGER_TEAM_MINUTES         : Option[Int],
  val CHALLENGER_TEAM_FGM             : Option[Int],
  val CHALLENGER_TEAM_FGA             : Option[Int],
  val CHALLENGER_TEAM_THREE_FGM       : Option[Int],
  val CHALLENGER_TEAM_THREE_FGA       : Option[Int],
  val CHALLENGER_TEAM_FT              : Option[Int],
  val CHALLENGER_TEAM_FTA             : Option[Int],
  val CHALLENGER_TEAM_PTS             : Option[Int],
  val CHALLENGER_TEAM_OFFREB          : Option[Int],
  val CHALLENGER_TEAM_DEFREB          : Option[Int],
  val CHALLENGER_TEAM_TOTREB          : Option[Int],
  val CHALLENGER_TEAM_AST             : Option[Int],
  val CHALLENGER_TEAM_TO              : Option[Int],
  val CHALLENGER_TEAM_STL             : Option[Int],
  val CHALLENGER_TEAM_BLK             : Option[Int],
  val CHALLENGER_TEAM_FOULS           : Option[Int],
  val NEUTRAL_SITE                    : Option[Int],
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

  override def productArity: Int = 101

  override def productElement(n: Int) = n match {
    case   0 => ID
    case   1 => LOCATION
    case   2 => GAME_ID
    case   3 => GAME_DATE
    case   4 => HERO_TEAM_ID
    case   5 => HERO_TEAM_NAME
    case   6 => HERO_TEAM_MINUTES
    case   7 => HERO_TEAM_FGM
    case   8 => HERO_TEAM_FGA
    case   9 => HERO_TEAM_THREE_FGM
    case  10 => HERO_TEAM_THREE_FGA
    case  11 => HERO_TEAM_FT
    case  12 => HERO_TEAM_FTA
    case  13 => HERO_TEAM_PTS
    case  14 => HERO_TEAM_OFFREB
    case  15 => HERO_TEAM_DEFREB
    case  16 => HERO_TEAM_TOTREB
    case  17 => HERO_TEAM_AST
    case  18 => HERO_TEAM_TO
    case  19 => HERO_TEAM_STL
    case  20 => HERO_TEAM_BLK
    case  21 => HERO_TEAM_FOULS
    case  22 => CHALLENGER_TEAM_ID
    case  23 => CHALLENGER_TEAM_NAME
    case  24 => CHALLENGER_TEAM_MINUTES
    case  25 => CHALLENGER_TEAM_FGM
    case  26 => CHALLENGER_TEAM_FGA
    case  27 => CHALLENGER_TEAM_THREE_FGM
    case  28 => CHALLENGER_TEAM_THREE_FGA
    case  29 => CHALLENGER_TEAM_FT
    case  30 => CHALLENGER_TEAM_FTA
    case  31 => CHALLENGER_TEAM_PTS
    case  32 => CHALLENGER_TEAM_OFFREB
    case  33 => CHALLENGER_TEAM_DEFREB
    case  34 => CHALLENGER_TEAM_TOTREB
    case  35 => CHALLENGER_TEAM_AST
    case  36 => CHALLENGER_TEAM_TO
    case  37 => CHALLENGER_TEAM_STL
    case  38 => CHALLENGER_TEAM_BLK
    case  39 => CHALLENGER_TEAM_FOULS
    case  40 => NEUTRAL_SITE
    case  41 => HERO_TEAM_FGPCT
    case  42 => HERO_TEAM_THREE_FGPCT
    case  43 => HERO_TEAM_FTPCT
    case  44 => HERO_TEAM_PTSAVG
    case  45 => HERO_TEAM_REBAVG
    case  46 => HERO_TEAM_DBLDBL
    case  47 => HERO_TEAM_TRPDBL
    case  48 => HERO_OPP_TEAM_MINUTES
    case  49 => HERO_OPP_TEAM_FGM
    case  50 => HERO_OPP_TEAM_FGA
    case  51 => HERO_OPP_TEAM_FGPCT
    case  52 => HERO_OPP_TEAM_THREE_FGM
    case  53 => HERO_OPP_TEAM_THREE_FGA
    case  54 => HERO_OPP_TEAM_THREE_FGPCT
    case  55 => HERO_OPP_TEAM_FT
    case  56 => HERO_OPP_TEAM_FTA
    case  57 => HERO_OPP_TEAM_FTPCT
    case  58 => HERO_OPP_TEAM_PTS
    case  59 => HERO_OPP_TEAM_PTSAVG
    case  60 => HERO_OPP_TEAM_OFFREB
    case  61 => HERO_OPP_TEAM_DEFREB
    case  62 => HERO_OPP_TEAM_TOTREB
    case  63 => HERO_OPP_TEAM_REBAVG
    case  64 => HERO_OPP_TEAM_AST
    case  65 => HERO_OPP_TEAM_TO
    case  66 => HERO_OPP_TEAM_STL
    case  67 => HERO_OPP_TEAM_BLK
    case  68 => HERO_OPP_TEAM_FOULS
    case  69 => HERO_OPP_TEAM_DBLDBL
    case  70 => HERO_OPP_TEAM_TRPDBL
    case  71 => CHALLENGER_TEAM_FGPCT
    case  72 => CHALLENGER_TEAM_THREE_FGPCT
    case  73 => CHALLENGER_TEAM_FTPCT
    case  74 => CHALLENGER_TEAM_PTSAVG
    case  75 => CHALLENGER_TEAM_REBAVG
    case  76 => CHALLENGER_TEAM_DBLDBL
    case  77 => CHALLENGER_TEAM_TRPDBL
    case  78 => CHALLENGER_OPP_TEAM_MINUTES
    case  79 => CHALLENGER_OPP_TEAM_FGM
    case  80 => CHALLENGER_OPP_TEAM_FGA
    case  81 => CHALLENGER_OPP_TEAM_FGPCT
    case  82 => CHALLENGER_OPP_TEAM_THREE_FGM
    case  83 => CHALLENGER_OPP_TEAM_THREE_FGA
    case  84 => CHALLENGER_OPP_TEAM_THREE_FGPCT
    case  85 => CHALLENGER_OPP_TEAM_FT
    case  86 => CHALLENGER_OPP_TEAM_FTA
    case  87 => CHALLENGER_OPP_TEAM_FTPCT
    case  88 => CHALLENGER_OPP_TEAM_PTS
    case  89 => CHALLENGER_OPP_TEAM_PTSAVG
    case  90 => CHALLENGER_OPP_TEAM_OFFREB
    case  91 => CHALLENGER_OPP_TEAM_DEFREB
    case  92 => CHALLENGER_OPP_TEAM_TOTREB
    case  93 => CHALLENGER_OPP_TEAM_REBAVG
    case  94 => CHALLENGER_OPP_TEAM_AST
    case  95 => CHALLENGER_OPP_TEAM_TO
    case  96 => CHALLENGER_OPP_TEAM_STL
    case  97 => CHALLENGER_OPP_TEAM_BLK
    case  98 => CHALLENGER_OPP_TEAM_FOULS
    case  99 => CHALLENGER_OPP_TEAM_DBLDBL
    case 100 => CHALLENGER_OPP_TEAM_TRPDBL
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
      string(parts(  0)),
      int   (parts(  1)),
      int   (parts(  2)),
      date  (parts(  3)),
      int   (parts(  4)),
      string(parts(  5)),
      int   (parts(  6)),
      int   (parts(  7)),
      int   (parts(  8)),
      int   (parts(  9)),
      int   (parts( 10)),
      int   (parts( 11)),
      int   (parts( 12)),
      int   (parts( 13)),
      int   (parts( 14)),
      int   (parts( 15)),
      int   (parts( 16)),
      int   (parts( 17)),
      int   (parts( 18)),
      int   (parts( 19)),
      int   (parts( 20)),
      int   (parts( 21)),
      int   (parts( 22)),
      string(parts( 23)),
      int   (parts( 24)),
      int   (parts( 25)),
      int   (parts( 26)),
      int   (parts( 27)),
      int   (parts( 28)),
      int   (parts( 29)),
      int   (parts( 30)),
      int   (parts( 31)),
      int   (parts( 32)),
      int   (parts( 33)),
      int   (parts( 34)),
      int   (parts( 35)),
      int   (parts( 36)),
      int   (parts( 37)),
      int   (parts( 38)),
      int   (parts( 39)),
      int   (parts( 40)),
      float (parts( 41)),
      float (parts( 42)),
      float (parts( 43)),
      float (parts( 44)),
      float (parts( 45)),
      int   (parts( 46)),
      int   (parts( 47)),
      int   (parts( 48)),
      int   (parts( 49)),
      int   (parts( 50)),
      float (parts( 51)),
      int   (parts( 52)),
      int   (parts( 53)),
      float (parts( 54)),
      int   (parts( 55)),
      int   (parts( 56)),
      float (parts( 57)),
      int   (parts( 58)),
      float (parts( 59)),
      int   (parts( 60)),
      int   (parts( 61)),
      int   (parts( 62)),
      float (parts( 63)),
      int   (parts( 64)),
      int   (parts( 65)),
      int   (parts( 66)),
      int   (parts( 67)),
      int   (parts( 68)),
      int   (parts( 69)),
      int   (parts( 70)),
      float (parts( 71)),
      float (parts( 72)),
      float (parts( 73)),
      float (parts( 74)),
      float (parts( 75)),
      int   (parts( 76)),
      int   (parts( 77)),
      int   (parts( 78)),
      int   (parts( 79)),
      int   (parts( 80)),
      float (parts( 81)),
      int   (parts( 82)),
      int   (parts( 83)),
      float (parts( 84)),
      int   (parts( 85)),
      int   (parts( 86)),
      float (parts( 87)),
      int   (parts( 88)),
      float (parts( 89)),
      int   (parts( 90)),
      int   (parts( 91)),
      int   (parts( 92)),
      float (parts( 93)),
      int   (parts( 94)),
      int   (parts( 95)),
      int   (parts( 96)),
      int   (parts( 97)),
      int   (parts( 98)),
      int   (parts( 99)),
      int   (parts(100))
    )
  }

}
