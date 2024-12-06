package gdfumo

import io.circe.Codec
import io.circe.generic.JsonCodec
import io.circe.generic.semiauto.deriveCodec

case class transmuteDbrs(
  f: String,
  n: String,
  a: String,
  m: String,
  l: String,
  o: String,
  g: Option[String],
  defensiveProtection: Int
)

object transmuteDbrs {
  implicit val codecJson: Codec[transmuteDbrs] = {
    val impl = deriveCodec[transmuteDbrs]
    Codec.from(impl, impl.mapJson(_.dropNullValues))
  }
}
