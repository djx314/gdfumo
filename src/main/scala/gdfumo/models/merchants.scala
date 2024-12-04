package gdfumo

import io.circe._
import io.circe.generic.JsonCodec
import io.circe.generic.semiauto._

@JsonCodec
case class merchants(tag: String, areaTag: List[String])
