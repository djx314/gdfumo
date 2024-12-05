package gdfumo.datatype

import shapeless._
import io.circe._
import io.circe.syntax._
import net.scalax.simple.adt.{TypeAdt => Adt}

trait AdtData2Abstract[T1, T2] {
  def data: Adt.CoProduct2[T1, T2]
  override def toString: String = data.fold(s => "data1: " + s.toString)(s => "data2: " + s.toString)
}
object AdtData2Abstract {
  def implEncoder[T1: Encoder, T2: Encoder]: Encoder[AdtData2Abstract[T1, T2]] =
    Encoder.instance[AdtData2Abstract[T1, T2]](d => d.data.fold(_.asJson)(_.asJson))

  def implDecoder[T1: Decoder, T2: Decoder]: Decoder[AdtData2Abstract[T1, T2]] = {
    val adtApply = Adt.CoProduct2[T1, T2]

    val de1: Decoder[T1]                         = implicitly
    val de2: Decoder[T2]                         = implicitly
    val de1Impl: Decoder[Adt.CoProduct2[T1, T2]] = de1.map(t => adtApply(t))
    val de2Impl: Decoder[Adt.CoProduct2[T1, T2]] = de2.map(t => adtApply(t))

    for (t <- de1Impl.or(de2Impl)) yield new AdtData2Abstract[T1, T2] {
      override def data: Adt.CoProduct2[T1, T2] = t
    }
  }
}

case class ListOrItem[T1](override val data: Adt.CoProduct2[T1, List[T1]]) extends AdtData2Abstract[T1, List[T1]]

object ListOrItem {
  def build[T1]: Apply[T1] = new Apply[T1]
  final class Apply[T1] {
    def apply[TIX: Adt.CoProducts2[*, T1, List[T1]]](d: TIX): ListOrItem[T1] = {
      val adtApply = Adt.CoProduct2[T1, List[T1]]
      ListOrItem[T1](adtApply(d))
    }
  }

  implicit def implEncoder[T1: Encoder]: Encoder[ListOrItem[T1]] =
    AdtData2Abstract.implEncoder[T1, List[T1]].contramap(s => ListOrItem(s.data))

  implicit def implDecoder[T1: Decoder]: Decoder[ListOrItem[T1]] = for (t <- AdtData2Abstract.implDecoder[T1, List[T1]])
    yield ListOrItem(t.data)
}

/*case class AdtData2[T1, T2](override val data: Adt.CoProduct2[T1, T2]) extends AdtData2Abstract[T1, T2]

object AdtData2 {
  def build[T1, T2]: Apply[T1, T2] = new Apply[T1, T2]
  final class Apply[T1, T2] {
    def apply[TIX: Adt.CoProducts2[*, T1, T2]](d: TIX): AdtData2[T1, T2] = {
      val adtApply = Adt.CoProduct2[T1, T2]
      AdtData2[T1, T2](adtApply(d))
    }
  }

  implicit def implEncoder[T1: Encoder, T2: Encoder]: Encoder[AdtData2[T1, T2]] =
    AdtData2Abstract.implEncoder[T1, T2].contramap(s => AdtData2(s.data))

  implicit def implDecoder[T1: Decoder, T2: Decoder]: Decoder[AdtData2[T1, T2]] = for (t <- AdtData2Abstract.implDecoder[T1, T2])
    yield AdtData2(t.data)
}*/

class StringOrInteger(override val data: Adt.CoProduct2[String, Int]) extends AdtData2Abstract[String, Int]

object StringOrInteger {
  def apply[TIX: Adt.CoProducts2[*, String, Int]](d: TIX): StringOrInteger = {
    val adtApply = Adt.CoProduct2[String, Int]
    new StringOrInteger(adtApply(d))
  }

  implicit def implEncoder: Encoder[StringOrInteger] =
    AdtData2Abstract.implEncoder[String, Int].contramap(s => new StringOrInteger(s.data))

  implicit def implDecoder: Decoder[StringOrInteger] = for (t <- AdtData2Abstract.implDecoder[String, Int])
    yield new StringOrInteger(t.data)
}
