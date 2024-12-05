package gdfumo.datatype

import shapeless._
import io.circe._
import io.circe.syntax._
import net.scalax.simple.adt.{TypeAdt => Adt}

case class AdtData2[T1, T2](data: Adt.CoProduct2[T1, T2]) extends AnyVal {
  override def toString: String = data.fold(s => "data1: " + s.toString)(s => "data2: " + s.toString)
}

object AdtData2 {
  def build[T1, T2]: Apply[T1, T2] = new Apply[T1, T2]
  final class Apply[T1, T2] {
    def apply[TIX: Adt.CoProducts2[*, T1, T2]](d: TIX): AdtData2[T1, T2] = {
      val adtApply = Adt.CoProduct2[T1, T2]
      AdtData2[T1, T2](adtApply(d))
    }
  }

  implicit def implEncoder[T1: Encoder, T2: Encoder]: Encoder[AdtData2[T1, T2]] =
    Encoder.instance[AdtData2[T1, T2]](d => d.data.fold(_.asJson)(_.asJson))

  implicit def implDecoder[T1: Decoder, T2: Decoder]: Decoder[AdtData2[T1, T2]] = {
    val adtApply = Adt.CoProduct2[T1, T2]

    val de1: Decoder[T1]                         = implicitly
    val de2: Decoder[T2]                         = implicitly
    val de1Impl: Decoder[Adt.CoProduct2[T1, T2]] = de1.map(t => adtApply(t))
    val de2Impl: Decoder[Adt.CoProduct2[T1, T2]] = de2.map(t => adtApply(t))

    for (t <- de1Impl.or(de2Impl)) yield AdtData2(t)
  }
}
