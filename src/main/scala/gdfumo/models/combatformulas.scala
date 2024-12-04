package gdfumo

import io.circe._
import io.circe.generic.JsonCodec
import io.circe.generic.semiauto._

@JsonCodec
case class combatformulas(
  pthMinimum: Int,
  shieldDamageReductionEquationDLEB: String,
  combatRegionHeadChance: Int,
  meleeBlockEquation: String,
  physicsStrengthMin: Int,
  pthThreshold5: Int,
  pthThreshold6: Int,
  combatRegionTorsoChance: Int,
  pthThreshold3: Int,
  pierceDamageEquation: String,
  pthThreshold4: Int,
  pthThreshold1: Int,
  pthThreshold2: Int,
  pthDamageModifier2: BigDecimal,
  shieldDamageReductionEquationDGB: String,
  physicalDamageDefenseEquationDGP: String,
  pthDamageModifier3: BigDecimal,
  pthDamageModifier4: BigDecimal,
  pthDamageModifier5: BigDecimal,
  physicsStrengthEquation: String,
  pthDamageModifier6: BigDecimal,
  physicalDurationDamageEquation: String,
  physicsStrengthMax: Int,
  magicalDamageEquation: String,
  combatRegionFeetChance: Int,
  physicalDamagePercentage: String,
  pthDamageModifier1: Int,
  probabilityToHitEquation: String,
  normalPTHEquation: String,
  physicalDamageEquation: String,
  combatRegionLegsChance: Int,
  offensiveAbilityEquation: String,
  projectileBlockEquation: String,
  physcialDamageDefenseEquationDLEP: String,
  combatRegionArmsChance: Int,
  defensiveAbilityEquation: String,
  magicalDurationDamageEquation: String,
  combatRegionShouldersChance: Int
)
