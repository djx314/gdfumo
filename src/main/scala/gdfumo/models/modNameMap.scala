package gdfumo

import io.circe.Codec
import io.circe.generic.JsonCodec
import io.circe.generic.semiauto.deriveCodec

@JsonCodec
case class modNameMap(
  gdx1: String,
  gdx2: String,
  survivalmode: String
)
