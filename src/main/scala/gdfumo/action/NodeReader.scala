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
import cats.Id
import com.caoccao.javet.interop.{NodeRuntime, V8Host, V8Runtime}

import java.io.PrintWriter
import java.nio.file.{Files, Path, Paths}
import scala.io.Source

object NodeReader {
  def inputToString: String = {
    def ioStream = this.getClass.getClassLoader.getResourceAsStream("gdfumo/itemdb.js")
    val charArr: Array[Char] = Using.resource(ioStream)(st1 =>
      Using.resource(Source.fromInputStream(st1)) { source =>
        source.toArray
      }
    )
    String.valueOf(charArr)
  }

  def main1(arr: Array[String]): Unit = {
    // println(inputToString)

    val execString =
      s"""
         var window = { };
         $inputToString ;
         JSON.stringify(window);
        """
    def runtimeImpl: NodeRuntime = V8Host.getNodeInstance().createV8Runtime()
    val resultString: String = Using.resource(runtimeImpl) { v8Runtime =>
      v8Runtime.getExecutor(execString).executeString()
    }

    val path: Path = Paths.get(".").resolve("src").resolve("main").resolve("resources").resolve("gdfumo").resolve("itemdb.json")
    Files.createDirectories(path.getParent)
    Using(new PrintWriter(path.toFile)) { writer =>
      writer.print(resultString)
    }

    /*try (V8Runtime v8Runtime = V8Host.getV8Instance().createV8Runtime()) {
      // Step 2: Execute a string as JavaScript code and print the result to console.
      System.out.println(v8Runtime.getExecutor("'Hello Javet'").executeString()); // Hello Javet
      // Step 3: Resource is recycled automatically at the end of the try-with-resource block.
    }*/
  }
}
