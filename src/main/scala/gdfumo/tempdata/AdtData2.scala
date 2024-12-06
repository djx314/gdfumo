package gdfumo.datatype

import io.circe._
import io.circe.syntax._
import net.scalax.simple.adt.{TypeAdt => Adt}

trait AdtData2Abstract[T1, T2] {
  def data2: Adt.CoProduct2[T1, T2]
  override def toString: String = data2.fold(s => "data1: " + s.toString)(s => "data2: " + s.toString)
}
object AdtData2Abstract {
  def build[T1, T2]: Apply[T1, T2] = new Apply
  final class Apply[T1, T2] {
    def apply[TIX: Adt.CoProducts2[*, T1, T2]](d: TIX): AdtData2Abstract[T1, T2] = {
      val adtApply = Adt.CoProduct2[T1, T2]
      new AdtData2Abstract[T1, T2] {
        override def data2: Adt.CoProduct2[T1, T2] = adtApply(d)
      }
    }
  }

  def implEncoder[T1: Encoder, T2: Encoder]: Encoder[AdtData2Abstract[T1, T2]] =
    Encoder.instance[AdtData2Abstract[T1, T2]](d => d.data2.fold(_.asJson)(_.asJson))

  def implDecoder[T1: Decoder, T2: Decoder]: Decoder[AdtData2Abstract[T1, T2]] = {
    val adtApply = Adt.CoProduct2[T1, T2]

    val de1: Decoder[T1]                         = implicitly
    val de2: Decoder[T2]                         = implicitly
    val de1Impl: Decoder[Adt.CoProduct2[T1, T2]] = de1.map(t => adtApply(t))
    val de2Impl: Decoder[Adt.CoProduct2[T1, T2]] = de2.map(t => adtApply(t))

    for (t <- de1Impl.or(de2Impl)) yield new AdtData2Abstract[T1, T2] {
      override def data2: Adt.CoProduct2[T1, T2] = t
    }
  }
}

class StringOrElse[T1](override val data2: Adt.CoProduct2[String, T1]) extends AdtData2Abstract[String, T1]

object StringOrElse {
  def build[T1]: Apply[T1] = new Apply
  final class Apply[T1] {
    def apply[TIX: Adt.CoProducts2[*, String, T1]](d: TIX): StringOrElse[T1] = {
      val adtApply = Adt.CoProduct2[String, T1]
      new StringOrElse(adtApply(d))
    }
  }

  implicit def implEncoder[T1: Encoder]: Encoder[StringOrElse[T1]] =
    AdtData2Abstract.implEncoder[String, T1].contramap(s => new StringOrElse(s.data2))

  implicit def implDecoder[T1: Decoder]: Decoder[StringOrElse[T1]] = for (t <- AdtData2Abstract.implDecoder[String, T1])
    yield new StringOrElse(t.data2)
}
