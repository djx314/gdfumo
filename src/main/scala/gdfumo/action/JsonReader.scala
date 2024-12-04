package gdfumo

import scala.io.Source
import scala.util.Using
import io.circe._
import io.circe.syntax._
import io.circe.generic.JsonCodec
import io.circe.generic.semiauto._

import java.io.PrintWriter
import java.nio.file.{Files, Path, Paths}
import scala.io.Source

object JsonReader {
  def inputToString: String = {
    def ioStream = this.getClass.getClassLoader.getResourceAsStream("gdfumo/itemdb.json")
    val charArr: Array[Char] = Using.resource(ioStream)(st1 =>
      Using.resource(Source.fromInputStream(st1)) { source =>
        source.toArray
      }
    )
    String.valueOf(charArr)
  }

  def main(arr: Array[String]): Unit = {
    (for {
      jsonSuccess <- parser.parse(inputToString)
      result      <- jsonSuccess.as[GrimTools]
    } yield {
      /*val preaa1        = result.petBonuses.values
      val reppsdklslfj2 = preaa1.flatMap(_.keys)
      val aa3 = reppsdklslfj2.groupBy(identity).map {
        case (a1, a2) => {
          if (a2.to(List).size == preaa1.size) {
            println(a1)
          }
        }
      }
      println(result.petBonuses.values.flatMap(_.keys).to(List).distinct)*/
      /*for (t <- result.petBonuses.values.flatMap(_.keys).to(List).distinct) {
        println(s"$t : Option[Json],")
      }*/
      println(result.player)
      println(result.asJson == jsonSuccess)
    }).left.foreach(println)
  }
}
