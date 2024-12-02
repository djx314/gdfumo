package gdfumo

import java.nio.charset.StandardCharsets
import util.Using
import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element
import org.jsoup.select.Elements
import scala.jdk.CollectionConverters._
import scala.collection.compat._
import net.scalax.simple.adt.{TypeAdt => Adt}

case class 抗性(
  火焰抗性: Int,
  冰冷抗性: Int,
  闪电抗性: Int,
  毒素抗性: Int,
  穿刺抗性: Int,
  流血抗性: Int,
  活力抗性: Int,
  虚化抗性: Int,
  混乱抗性: Int
)
object 抗性 {
  val empty: 抗性 = 抗性(火焰抗性 = 0, 冰冷抗性 = 0, 闪电抗性 = 0, 毒素抗性 = 0, 穿刺抗性 = 0, 流血抗性 = 0, 活力抗性 = 0, 虚化抗性 = 0, 混乱抗性 = 0)
}

case class Fumo[Data](id: Int, name: String, data: Data)

case class 元素抗性[Data](value: Data) extends AnyVal
case class 火焰抗性[Data](value: Data) extends AnyVal
case class 冰冷抗性[Data](value: Data) extends AnyVal
case class 闪电抗性[Data](value: Data) extends AnyVal
case class 毒素抗性[Data](value: Data) extends AnyVal
case class 穿刺抗性[Data](value: Data) extends AnyVal
case class 流血抗性[Data](value: Data) extends AnyVal
case class 活力抗性[Data](value: Data) extends AnyVal
case class 虚化抗性[Data](value: Data) extends AnyVal
case class 混乱抗性[Data](value: Data) extends AnyVal
case class 其它抗性(key: String, value: String)

type 抗性Data[Data] =
  Adt.CoProduct11[元素抗性[Data], 火焰抗性[Data], 冰冷抗性[Data], 闪电抗性[Data], 毒素抗性[Data], 穿刺抗性[Data], 流血抗性[Data], 活力抗性[Data], 虚化抗性[Data], 混乱抗性[
    Data
  ], 其它抗性]

object 抗性Data:
  def apply[Data]: Adt.CoProduct11Apply[元素抗性[Data], 火焰抗性[Data], 冰冷抗性[Data], 闪电抗性[Data], 毒素抗性[Data], 穿刺抗性[Data], 流血抗性[Data], 活力抗性[
    Data
  ], 虚化抗性[Data], 混乱抗性[Data], 其它抗性] =
    Adt.CoProduct11[元素抗性[Data], 火焰抗性[Data], 冰冷抗性[Data], 闪电抗性[Data], 毒素抗性[Data], 穿刺抗性[Data], 流血抗性[Data], 活力抗性[Data], 虚化抗性[Data], 混乱抗性[
      Data
    ], 其它抗性]
end 抗性Data

object HmlReader:

  def inputToString: Document =
    val baseUri: String = """https://www.grimtools.com/db/zh/category/helms/augments"""
    def ioStream        = this.getClass.getClassLoader.getResourceAsStream("gdfumo/HtmlTxt.txt")
    Using.resource(ioStream)(st1 => Jsoup.parse(st1, StandardCharsets.UTF_8.name(), baseUri))
  end inputToString

  def names: List[Fumo[List[(String, String)]]] =
    val doc: Document           = inputToString
    val newsHeadlines: Elements = doc.select("#item-list .item-list-group .item-card.item-enchant .item-description")
    val eles: List[Element]     = for (ele <- newsHeadlines.asScala.to(List)) yield ele
    for (ele <- eles) yield
      val attrElements: List[Element]  = ele.select(".tooltip-skill-params.item-padded-h.item-padded-v > div").asScala.to(List)
      val attr: List[(String, String)] = for (attrEle <- attrElements) yield (attrEle.select(".text-brown").text(), attrEle.text())

      val eleId: Elements  = ele.select(".item-name.epic")
      val fumoName: String = eleId.text()
      val fumoId: Int =
        eleId
          .attr("href")
          .match
            case s"/db/zh/items/$id" => id.toInt
        end match

      Fumo[List[(String, String)]](id = fumoId, name = fumoName, data = attr)
    end for
  end names

  def extractTo抗性: List[Fumo[List[抗性Data[String]]]] =
    val nameMap: List[Fumo[List[(String, String)]]] = names

    val applyInstance = 抗性Data.apply[String]
    def stringToAdt(key: String, value: String): 抗性Data[String] = {
      def persent: String = value.replace(key, "").trim

      key.match {
        case "元素抗性"    => applyInstance(元素抗性[String](persent))
        case "火焰抗性"    => applyInstance(火焰抗性[String](persent))
        case "冰冷抗性"    => applyInstance(冰冷抗性[String](persent))
        case "闪电抗性"    => applyInstance(闪电抗性[String](persent))
        case "毒素&酸性抗性" => applyInstance(毒素抗性[String](persent))
        case "穿刺抗性"    => applyInstance(穿刺抗性[String](persent))
        case "流血抗性"    => applyInstance(流血抗性[String](persent))
        case "活力抗性"    => applyInstance(活力抗性[String](persent))
        case "虚化抗性"    => applyInstance(虚化抗性[String](persent))
        case "混乱抗性"    => applyInstance(混乱抗性[String](persent))
        case _         => applyInstance(其它抗性(key = key, value = value))
      }
    }

    for (eachM <- nameMap) yield {
      val valueSeq: List[抗性Data[String]] = for (key, value) <- eachM.data yield stringToAdt(key = key, value = value)
      eachM.copy(data = valueSeq)
    }
  end extractTo抗性

  def 抗性DataStringToInt(d: 抗性Data[String]): 抗性Data[Int] = {
    def replaceString(str: String): Int =
      str.match
        case s"$t%" => t.toInt
      end match
    end replaceString

    val applyInt = 抗性Data.apply[Int]

    d.fold
      .apply(s => applyInt(s.copy(replaceString(s.value))))
      .apply(s => applyInt(s.copy(replaceString(s.value))))
      .apply(s => applyInt(s.copy(replaceString(s.value))))
      .apply(s => applyInt(s.copy(replaceString(s.value))))
      .apply(s => applyInt(s.copy(replaceString(s.value))))
      .apply(s => applyInt(s.copy(replaceString(s.value))))
      .apply(s => applyInt(s.copy(replaceString(s.value))))
      .apply(s => applyInt(s.copy(replaceString(s.value))))
      .apply(s => applyInt(s.copy(replaceString(s.value))))
      .apply(s => applyInt(s.copy(replaceString(s.value))))
      .apply(s => applyInt(s))
  }

  def 抗性IntToCopy(d: 抗性Data[Int]): 抗性 => 抗性 = d.fold
    .apply((s: 元素抗性[Int]) => (t: 抗性) => t.copy(火焰抗性 = t.火焰抗性 + s.value, 冰冷抗性 = t.冰冷抗性 + s.value, 闪电抗性 = t.闪电抗性 + s.value))
    .apply((s: 火焰抗性[Int]) => (t: 抗性) => t.copy(火焰抗性 = t.火焰抗性 + s.value))
    .apply((s: 冰冷抗性[Int]) => (t: 抗性) => t.copy(冰冷抗性 = t.冰冷抗性 + s.value))
    .apply((s: 闪电抗性[Int]) => (t: 抗性) => t.copy(闪电抗性 = t.闪电抗性 + s.value))
    .apply((s: 毒素抗性[Int]) => (t: 抗性) => t.copy(毒素抗性 = t.毒素抗性 + s.value))
    .apply((s: 穿刺抗性[Int]) => (t: 抗性) => t.copy(穿刺抗性 = t.穿刺抗性 + s.value))
    .apply((s: 流血抗性[Int]) => (t: 抗性) => t.copy(流血抗性 = t.流血抗性 + s.value))
    .apply((s: 活力抗性[Int]) => (t: 抗性) => t.copy(活力抗性 = t.活力抗性 + s.value))
    .apply((s: 虚化抗性[Int]) => (t: 抗性) => t.copy(虚化抗性 = t.虚化抗性 + s.value))
    .apply((s: 混乱抗性[Int]) => (t: 抗性) => t.copy(混乱抗性 = t.混乱抗性 + s.value))
    .apply((s: 其它抗性) => (t: 抗性) => t)
  end 抗性IntToCopy

  def 抗性IntListToCopy(d: List[抗性Data[Int]]): 抗性 => 抗性 =
    val zero: 抗性 => 抗性 = identity
    d.foldLeft(zero)((i1, i2) => (t: 抗性) => i1(抗性IntToCopy(i2)(t)))
  end 抗性IntListToCopy

  def main(arr: Array[String]): Unit =
    val data: List[Fumo[抗性]] = for (eachM <- extractTo抗性) yield {
      val col1 = for (each <- eachM.data) yield 抗性DataStringToInt(each)
      val 抗性1  = 抗性IntListToCopy(col1)(抗性.empty)
      eachM.copy(data = 抗性1)
    }

    for (d <- data) {
      println(d)
    }
    println(data.size)
  end main

end HmlReader
