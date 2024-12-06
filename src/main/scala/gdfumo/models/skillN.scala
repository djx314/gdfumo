package gdfumo

import datatype.ListOrItem
import io.circe.generic.JsonCodec

@JsonCodec
case class skillN(level: ListOrItem[String], skill: spawnSkill)
