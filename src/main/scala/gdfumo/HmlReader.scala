package gdfumo

import java.nio.charset.StandardCharsets
import scala.io.Source
import util.Using
import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element
import org.jsoup.select.Elements
import scala.jdk.CollectionConverters._
import scala.collection.compat._

object HmlReader {

  // https://www.grimtools.com/db/zh/category/helms/augments
  def inputToString: String = Using.resource(this.getClass.getClassLoader.getResourceAsStream("gdfumo/HtmlTxt.txt")) { st1 =>
    Using.resource(Source.fromInputStream(st1, StandardCharsets.UTF_8.name())) { source =>
      source.getLines().mkString("\n")
    }
  }

  def names: List[(Elements, String)] = {
    val doc: Document           = Jsoup.parse(inputToString)
    val newsHeadlines: Elements = doc.select("#item-list .item-list-group .item-card.item-enchant .item-description")
    val eles: List[Element]     = for (ele <- newsHeadlines.asScala.to(List)) yield ele
    for (ele <- eles) yield {
      (ele.select(".tooltip-skill-params.item-padded-h.item-padded-v > div"), ele.select(".item-name.epic").html())
    }
  }

  def main(arr: Array[String]): Unit = {
    println(names)
  }

}
