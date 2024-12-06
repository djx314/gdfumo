package gdfumo

import datatype.GDArrayNotNone
import io.circe.generic.JsonCodec

@JsonCodec
case class skillN(level: GDArrayNotNone[String], skill: spawnSkill)
