package gdfumo

import io.circe._
import io.circe.generic.JsonCodec
import io.circe.generic.semiauto._

@JsonCodec
case class modNameMap(
  gdx1: String,
  gdx2: String,
  survivalmode: String
)
