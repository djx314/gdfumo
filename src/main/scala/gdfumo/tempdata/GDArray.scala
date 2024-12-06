package gdfumo.datatype

import io.circe._
import io.circe.syntax._
import net.scalax.simple.adt.{TypeAdt => Adt}

trait GDArray[T] extends AdtData2Abstract[None.type, GDArrayNotNone[T] with AdtData2Abstract[T, (T, T, List[T])]] {
  def data3: Adt.CoProduct3[None.type, T, (T, T, List[T])]

  def toList: List[T] = data3.fold(t => t.toList)(t => List(t))(t => t._1 :: t._2 :: t._3)

  override def data2: Adt.CoProduct2[None.type, GDArrayNotNone[T] with AdtData2Abstract[T, (T, T, List[T])]] = {
    val adtApply  = Adt.CoProduct2[None.type, GDArrayNotNone[T] with AdtData2Abstract[T, (T, T, List[T])]]
    val adtApply2 = GDArrayNotNone.build[T]
    data3.fold((t: None.type) => adtApply(t))(t => adtApply(adtApply2(t)))(t => adtApply(adtApply2(t)))
  }
}

object GDArray {

  def apply[T](data: Adt.CoProduct3[None.type, T, (T, T, List[T])]): GDArray[T] = new GDArray[T] {
    def data3: Adt.CoProduct3[None.type, T, (T, T, List[T])] = data
  }

  private def adtApply[T]: Adt.CoProduct3Apply[None.type, T, (T, T, List[T])] = Adt.CoProduct3[None.type, T, (T, T, List[T])]

  def fromList[T](l: List[T]): GDArray[T] = {
    val applyImpl = adtApply[T]

    l match {
      case Nil => GDArray(applyImpl(None))
      case t1 :: tail =>
        tail match {
          case Nil         => GDArray(applyImpl(t1))
          case t2 :: tail2 => GDArray(applyImpl((t1, t2, tail2)))
        }
    }
  }

  implicit def encoderImpl[T: Encoder]: Encoder[GDArray[T]] = Encoder.instance[GDArray[T]] { t =>
    val enc1 = Encoder[GDArrayNotNone[T]]
    t.data2.fold((t: None.type) => t.asJson)(t => t.asJson(enc1))
  }

  implicit def decoderImpl[T: Decoder]: Decoder[GDArray[T]] = {
    val apply1 = Adt.CoProduct3[None.type, T, (T, T, List[T])]

    val v1: Decoder[Adt.CoProduct3[None.type, T, (T, T, List[T])]] =
      for (t1 <- GDArrayNotNone.implDecoder[T]) yield t1.data2.fold(t => apply1(t))(t => apply1(t))

    val v2: Decoder[Adt.CoProduct3[None.type, T, (T, T, List[T])]] = for (t1 <- Decoder[None.type]) yield apply1(t1)

    for (t1 <- v1.or(v2)) yield GDArray(t1)
  }

}

case class GDArrayNotNone[T1](override val data2: Adt.CoProduct2[T1, (T1, T1, List[T1])]) extends AdtData2Abstract[T1, (T1, T1, List[T1])]

object GDArrayNotNone {
  def build[T1]: Apply[T1] = new Apply[T1]
  final class Apply[T1] {
    def apply[TIX: Adt.CoProducts2[*, T1, (T1, T1, List[T1])]](d: TIX): GDArrayNotNone[T1] = {
      val adtApply = Adt.CoProduct2[T1, (T1, T1, List[T1])]
      GDArrayNotNone[T1](adtApply(d))
    }
  }

  implicit def implEncoder[T1: Encoder]: Encoder[GDArrayNotNone[T1]] =
    AdtData2Abstract.implEncoder[T1, List[T1]].contramap { (s: GDArrayNotNone[T1]) =>
      val build = AdtData2Abstract.build[T1, List[T1]]
      s.data2.fold(t => build(t))(t => build(t._1 :: t._2 :: t._3))
    }

  implicit def implDecoder[T1: Decoder]: Decoder[GDArrayNotNone[T1]] = for (t <- AdtData2Abstract.implDecoder[T1, List[T1]])
    yield {
      val bd = build[T1]

      t.data2.fold((t: T1) => bd(t)) { case a :: b :: tail =>
        bd((a, b, tail))
      }
    }
}
