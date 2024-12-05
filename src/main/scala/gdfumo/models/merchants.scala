package gdfumo

import io.circe.Codec
import io.circe.generic.JsonCodec
import io.circe.generic.semiauto.deriveCodec

@JsonCodec
case class merchants(tag: String, areaTag: List[String])
