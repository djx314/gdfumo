package gdfumo

import net.scalax.simple.adt.{TypeAdt => Adt}

object JsonAST {
  case class JsonObject(value: List[(String, JsonByADT)]) extends AnyVal
  type JsonByADT = Adt.CoProduct4[BigDecimal, String, Boolean, JsonObject]
}

case class OtherJsonADT(data: Adt.CoProduct4[BigDecimal, String, Boolean, List[(String, OtherJsonADT)]]) extends AnyVal
