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
      /*println(result.itemSkills.values.flatMap(_.item1.petSkillName.toList.flatMap(_.keys)).to(Set))
      for (t <- result.itemSkills.values.flatMap(_.item1.petSkillName.toList.flatMap(_.keys)).to(Set)) {
        println(s"$t:Option[Json],")
      }*/
      println(result.asJson == jsonSuccess)

      val preaa1: List[String] = result.allItems.values.to(List).flatMap(_.item1.replacementAnimsMale.toList.flatMap(_.keys))
      // println(preaa1.to(Set))
      // println(preaa1.to(Set).size)

      /*val preaa2 = result.itemSkills.values
        .flatMap(_.item1.petSkillName.toList)
        .to(Set)
        .asJson
        .as[List[Map[String, Json]]]
        .getOrElse(???)
        .flatMap(_.keys)
      println(preaa2.size)
      preaa2.groupBy(identity).map { case (t1, t2) =>
        if (t2.size == result.itemSkills.values.flatMap(_.item1.petSkillName.to(List)).size) {
          println(t1)
        }
      }*/
      /*val col1 = for {
        x1 <- result.itemSkills.values.to(List)
        t  <- x1.item1.spawnObjects.toList
      } yield {
        val b1 = List(Some(t.skill1), t.skill2, t.skill3, t.skill4, t.skill5, t.skill6, t.skill7, t.skill8, t.skill9, t.skill10)
        b1.collect { case Some(t) => t }
      }
      val col2: List[spawnSkill] = col1.flatten.map(_.skill)
      val nnaa3                  = col2.map(t => t.asJson.as[Map[String, Json]].getOrElse(???))
      val aa3 = nnaa3.flatMap(_.keys).groupBy(identity).map {
        case (a1, a2) => {
          if (a2.to(List).size == nnaa3.size) {
            println(a1)
          }
        }
      }*/
      /*for (k <- result.itemSkills.values.flatMap(_.keys).to(Set)) {
        println(s"$k:Option[Json],")
      }*/

      /*val col1 = result.itemSkills.values.flatMap(_.item1.spawnObjects.toList.map(_.characterAttributeEquations))
      val col  = col1.map(t => characterAttributeEquations.deriv._1.encode(t, characterAttributeEquations.deriv._2))

      val set  = col.flatMap(_._1).collect { case t if t._2 != "Option[Json]" => t }.to(Set)
      val map  = set.toList
      val set2 = map.map(_._1).groupBy(identity).collect { case (i1, i2) if i2.to(List).size == 1 => i1 }
      val set3 = map.map(_._1).groupBy(identity).collect { case (i1, i2) if i2.to(List).size > 1 => (i1, i2) }
      for (t <- set2) {
        println(s"${t}:${map.toMap.get(t).get},")
      }
      for ((t1, t2) <- set3) {
        val aa = set.toList.filter(t => t._1 == t1).map(_._2)
        println(s"${t1}:AdtData2[${aa(0)},${aa(1)}],")
      }
      println(set.size)*/

      /*val t: List[String] = result.itemSkills.values
        .flatMap(_.item1.spawnObjects.toList.flatMap { t =>
          val b1 = List(Some(t.skill1), t.skill2, t.skill3, t.skill4, t.skill5, t.skill6, t.skill7, t.skill8, t.skill9, t.skill10)
          val b2 = b1.collect { case Some(t) => t }
          b2.flatMap(x => x.skill.as[Map[String, Json]].getOrElse(???).keys.to(List))
        })
        .to(List)
      println(t.to(Set))
      println(t.to(Set).size)
      for (t <- t.to(Set)) {
        println(s"$t: Option[Json],")
      }*/
    }).left.foreach(println)
  }
}
