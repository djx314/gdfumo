package gdfumo

import io.circe.Codec
import io.circe.generic.JsonCodec
import io.circe.generic.semiauto.deriveCodec
import datatype.{ListOrItem, StringOrElse}

case class bonusTableAffixes(
  l: String,
  f: String,
  k: Int,
  o: String,
  cls: List[String],
  augmentSkillName2: Option[String],
  augmentSkillName1: Option[String],
  petBonusName: Option[String],
  itemSkillLevelEq: Option[StringOrElse[Int]],
  itemSkillAutoController: Option[String],
  mods: Option[List[String]],
  itemSkillName: Option[String],
  characterIntelligenceModifier: Option[Int],
  characterDexterityModifier: Option[Int],
  characterStrengthModifier: Option[Int],
  racialBonusPercentDamage: Option[Int],
  racialBonusRace: Option[ListOrItem[String]],
  i: Option[Int],
  characterStrength: Option[BigDecimal],
  characterDexterity: Option[BigDecimal],
  offensiveLifeModifier: Option[BigDecimal],
  offensiveFireModifier: Option[BigDecimal],
  offensivePhysicalModifier: Option[BigDecimal],
  retaliationLightningMin: Option[BigDecimal],
  characterMana: Option[BigDecimal],
  characterDefensiveAbility: Option[BigDecimal],
  characterIntelligence: Option[BigDecimal],
  offensiveSlowBleedingModifier: Option[BigDecimal],
  defensiveAether: Option[BigDecimal],
  offensivePoisonModifier: Option[BigDecimal],
  defensiveFreeze: Option[BigDecimal],
  defensiveChaos: Option[BigDecimal],
  characterSpellCastSpeedModifier: Option[BigDecimal],
  defensiveLightning: Option[BigDecimal],
  characterDefensiveAbilityModifier: Option[BigDecimal],
  characterManaModifier: Option[BigDecimal],
  defensiveCold: Option[BigDecimal],
  characterOffensiveAbilityModifier: Option[BigDecimal],
  characterTotalSpeedModifier: Option[BigDecimal],
  defensiveBleeding: Option[BigDecimal],
  characterLifeModifier: Option[BigDecimal],
  characterLifeRegenModifier: Option[BigDecimal],
  characterOffensiveAbility: Option[BigDecimal],
  defensivePierce: Option[BigDecimal],
  characterAttackSpeedModifier: Option[BigDecimal],
  offensiveAetherModifier: Option[BigDecimal],
  offensiveChaosModifier: Option[BigDecimal],
  defensiveBonusProtection: Option[BigDecimal],
  offensivePierceModifier: Option[BigDecimal],
  offensiveCritDamageModifier: Option[BigDecimal],
  retaliationLightningMax: Option[BigDecimal],
  offensiveTotalDamageModifier: Option[BigDecimal],
  defensiveLife: Option[BigDecimal],
  defensivePetrify: Option[BigDecimal],
  defensiveElementalResistance: Option[BigDecimal],
  characterManaRegenModifier: Option[BigDecimal],
  offensiveColdModifier: Option[BigDecimal],
  offensiveLightningModifier: Option[BigDecimal],
  augmentSkillLevel1: Option[BigDecimal],
  characterLife: Option[BigDecimal],
  defensiveStun: Option[BigDecimal],
  defensiveFire: Option[BigDecimal],
  offensiveSlowPoisonModifier: Option[BigDecimal],
  augmentSkillLevel2: Option[BigDecimal],
  defensivePoison: Option[BigDecimal]
)

object bonusTableAffixes {
  implicit val codecJson: Codec[bonusTableAffixes] = {
    val impl = deriveCodec[bonusTableAffixes]
    Codec.from(impl, impl.mapJson(_.dropNullValues))
  }
}
