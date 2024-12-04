package gdfumo

import io.circe._
import io.circe.generic.JsonCodec
import io.circe.generic.semiauto._

@JsonCodec
case class monsters(`type`: String, tag: String, onMap: Boolean)
