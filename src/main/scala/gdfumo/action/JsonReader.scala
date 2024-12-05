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
      /*val preaa1 = result.suffixes.values.asJson.as[List[Map[String, Json]]].getOrElse(???).flatMap(_.keys)
      val preaa2 = result.prefixes.values.asJson.as[List[Map[String, Json]]].getOrElse(???).flatMap(_.keys)
      println(preaa1.size)
      println(preaa2.size)
      val preaa3 = preaa2.filter(t => !preaa1.exists(t2 => t == t2))
      println(preaa3.size)
      println(preaa2.size - preaa1.size)
      preaa2.groupBy(identity).map { case (t1, t2) =>
        if (t2.size == result.prefixes.size) {
          println(t1)
        }
      }*/
      /*val reppsdklslfj2 = result.itemSkills
      val aa3 = reppsdklslfj2.values.flatMap(_.keys).groupBy(identity).map {
        case (a1, a2) => {
          if (a2.to(List).size == reppsdklslfj2.size) {
            println(a1)
          }
        }
      }
      for (k <- result.itemSkills.values.flatMap(_.keys).to(Set)) {
        println(s"$k:Option[Json],")
      }*/

      /*val col =
        for (x1 <- result.buffSkills.values.to(List))
          yield buffSkills.derived111._1.encode(x1, buffSkills.derived111._2)
      val set  = col.flatMap(_._1).collect { case t if t._2 != "Option[Json]" => t }.to(Set)
      val map  = set.toList
      val set2 = map.map(_._1).groupBy(identity).collect { case (i1, i2) if i2.to(List).size == 1 => i1 }
      val set3 = map.map(_._1).groupBy(identity).collect { case (i1, i2) if i2.to(List).size > 1 => i1 }
      for (t <- set2) {
        println(s"${t}:${map.toMap.get(t).get},")
      }
      for (t <- set3) {
        println(s"${t}:Option[Json],")
      }
      println(set.size)*/

      println(result.player.characterAttackSpeed)
      println(result.asJson == jsonSuccess)
    }).left.foreach(println)
  }
}
