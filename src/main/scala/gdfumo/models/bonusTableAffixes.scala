package gdfumo

import io.circe._
import io.circe.generic.JsonCodec
import io.circe.generic.semiauto._

case class bonusTableAffixes(
  l: String,
  f: String,
  k: Int,
  o: String,
  cls: List[String],
  augmentSkillLevel1: Option[BigDecimal],
  augmentSkillName2: Option[String],
  augmentSkillLevel2: Option[BigDecimal],
  augmentSkillName1: Option[String],
  i: Option[BigDecimal],
  offensiveLifeModifier: Option[Json],
  racialBonusPercentDamage: Option[Json],
  offensiveChaosModifier: Option[Json],
  defensiveBonusProtection: Option[Json],
  offensiveColdModifier: Option[Json],
  characterDefensiveAbility: Option[Json],
  defensiveFire: Option[Json],
  defensivePetrify: Option[Json],
  characterLifeModifier: Option[Json],
  defensivePoison: Option[Json],
  offensiveFireModifier: Option[Json],
  characterDexterityModifier: Option[Json],
  offensivePhysicalModifier: Option[Json],
  defensivePierce: Option[Json],
  racialBonusRace: Option[Json],
  offensiveLightningModifier: Option[Json],
  itemSkillLevelEq: Option[Json],
  offensivePoisonModifier: Option[Json],
  offensiveSlowPoisonModifier: Option[Json],
  itemSkillName: Option[Json],
  characterLifeRegenModifier: Option[Json],
  characterSpellCastSpeedModifier: Option[Json],
  characterDefensiveAbilityModifier: Option[Json],
  defensiveChaos: Option[Json],
  offensiveTotalDamageModifier: Option[Json],
  characterMana: Option[Json],
  mods: Option[Json],
  defensiveAether: Option[Json],
  characterLife: Option[Json],
  retaliationLightningMax: Option[Json],
  defensiveFreeze: Option[Json],
  characterIntelligenceModifier: Option[Json],
  characterManaRegenModifier: Option[Json],
  characterStrengthModifier: Option[Json],
  defensiveLightning: Option[Json],
  characterTotalSpeedModifier: Option[Json],
  characterManaModifier: Option[Json],
  defensiveCold: Option[Json],
  retaliationLightningMin: Option[Json],
  itemSkillAutoController: Option[Json],
  characterAttackSpeedModifier: Option[Json],
  characterStrength: Option[Json],
  offensiveAetherModifier: Option[Json],
  characterOffensiveAbility: Option[Json],
  characterDexterity: Option[Json],
  defensiveLife: Option[Json],
  characterOffensiveAbilityModifier: Option[Json],
  defensiveBleeding: Option[Json],
  characterIntelligence: Option[Json],
  offensivePierceModifier: Option[Json],
  defensiveStun: Option[Json],
  petBonusName: Option[Json],
  offensiveSlowBleedingModifier: Option[Json],
  offensiveCritDamageModifier: Option[Json],
  defensiveElementalResistance: Option[Json]
)

object bonusTableAffixes {
  implicit val codecJson: Codec[bonusTableAffixes] = {
    val impl = deriveCodec[bonusTableAffixes]
    Codec.from(impl, impl.mapJson(_.dropNullValues))
  }

  val derived111: (En121[bonusTableAffixes], shapeless.HList) = En121.derived
}
