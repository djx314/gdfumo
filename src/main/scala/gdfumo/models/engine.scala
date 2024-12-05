package gdfumo

import io.circe.Codec
import io.circe.generic.JsonCodec
import io.circe.generic.semiauto.deriveCodec

@JsonCodec
case class engine(
  milestones: List[Int],
  playerRunSpeedCapMax: Int,
  playerSpellCastSpeedCapMax: Int,
  playerAttackSpeedCapMax: Int,
  playerDefenseCap: List[Int],
  armorDefensiveAbsorption: Int,
  autoCastEquation: String,
  questSkillPoints: Int,
  questAttributePoints: Int
)
