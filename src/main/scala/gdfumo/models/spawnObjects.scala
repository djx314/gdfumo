package gdfumo

import io.circe.Codec
import io.circe.generic.JsonCodec
import io.circe.generic.semiauto.deriveCodec

case class spawnObjects(
  description: String,
  charLevel: String,
  characterAttributeEquations: characterAttributeEquations,
  invincible: Option[Boolean],
  skill1: skillN,
  skill2: Option[skillN],
  skill3: Option[skillN],
  skill4: Option[skillN],
  skill5: Option[skillN],
  skill6: Option[skillN],
  skill7: Option[skillN],
  skill8: Option[skillN],
  skill9: Option[skillN],
  skill10: Option[skillN]
)

object spawnObjects {
  implicit val codecJson: Codec[spawnObjects] = {
    val impl = deriveCodec[spawnObjects]
    Codec.from(impl, impl.mapJson(_.dropNullValues))
  }
}
