package gdfumo

import io.circe.Codec
import io.circe.generic.JsonCodec
import io.circe.generic.semiauto.deriveCodec

@JsonCodec
case class factions(tag: String, icon: String, items: List[String])
