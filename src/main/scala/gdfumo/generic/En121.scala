package gdfumo

import shapeless._
import io.circe._

trait En121[T] {
  def encode(data: T, nameHList: HList): (List[(String, String)], Int, Boolean)
}

object En121 extends En121Impl {

  implicit def hlistAppend[B <: HList](implicit e: En121[B]): En121[Option[Json] :: B] = new En121[Option[Json] :: B] {
    override def encode(data: Option[Json] :: B, nameHList: HList): (List[(String, String)], Int, Boolean) = {

      val tailEncode = e.encode(data.tail, nameHList.asInstanceOf[Any :: HList].tail)

      if (!tailEncode._3) {
        println("请移动列.")
        println("请移动列.")
      }

      val value: (String, Int) = data.head match {
        case None => ("Option[Json]", 0)
        case Some(json) =>
          json.fold(
            ("Option[Json]", 0),
            boo => ("Option[Boolean]", 1),
            jsonNumber => ("Option[BigDecimal]", 1),
            jsonString => ("Option[String]", 1),
            jsonArray => ("Option[List[Json]]", 1),
            jsonObject => ("Option[Map[String, Json]]", 1)
          )
      }
      ((nameHList.asInstanceOf[Symbol :: HList].head.name, value._1) :: tailEncode._1, tailEncode._2 + value._2, tailEncode._3)
    }
  }

  implicit val hlistZero: En121[HNil] = new En121[HNil] {
    override def encode(data: HNil, nameHList: HList): (List[(String, String)], Int, Boolean) = (List.empty, 0, true)
  }

  def derived111122221[T, H <: HList](implicit
    aa: Generic.Aux[T, H],
    bb: DefaultSymbolicLabelling.Aux[T, _ <: HList],
    en121: En121[H]
  ): (En121[T], HList) = {
    val enc1 = new En121[T] {
      def encode(data: T, nameHList: HList): (List[(String, String)], Int, Boolean) = en121.encode(aa.to(data), nameHList)
    }
    (enc1, bb.apply())
  }

}

trait En121Impl {
  implicit def hlistAppendLow2[A, B <: HList](implicit e: En121[B]): En121[A :: B] = new En121[A :: B] {
    override def encode(data: A :: B, nameHList: HList): (List[(String, String)], Int, Boolean) =
      e.encode(data.tail, nameHList.asInstanceOf[Any :: HList].tail).copy(_3 = false)
  }
}
