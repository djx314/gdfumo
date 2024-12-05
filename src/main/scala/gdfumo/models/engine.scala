package gdfumo

import io.circe._
import io.circe.generic.JsonCodec
import io.circe.generic.semiauto._

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
