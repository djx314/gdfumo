package gdfumo

import io.circe.generic.JsonCodec

@JsonCodec
case class containers(tag: String, areaTag: List[String], onMap: Boolean)
