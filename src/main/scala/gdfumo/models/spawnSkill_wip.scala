package gdfumo

import io.circe.Codec
import io.circe.generic.semiauto.deriveCodec
import datatype.GDArray

case class spawnSkill(
  l: String,
  o: Option[String],
  templateName: String,
  waveDistance: Option[BigDecimal],
  offensiveFireMax: Option[List[Int]],
  projectileLaunchRotation: Option[BigDecimal],
  projectileExplosionRadius: Option[BigDecimal],
  offensiveSlowFireDurationMin: Option[BigDecimal],
  offensivePierceMax: Option[List[Int]],
  defensivePercentCurrentLife: Option[BigDecimal],
  defensivePoisonDuration: Option[BigDecimal],
  offensiveSlowDefensiveAbilityDurationMin: Option[BigDecimal],
  skillBaseDescription: Option[String],
  offensiveFreezeMax: Option[BigDecimal],
  offensiveTotalResistanceReductionAbsoluteMin: Option[List[Int]],
  isPetDisplayable: Option[BigDecimal],
  defensiveFire: Option[BigDecimal],
  offensiveSlowFireMin: Option[List[Int]],
  skillActiveDuration: Option[BigDecimal],
  offensiveChaosMax: Option[List[Int]],
  defensivePetrify: Option[BigDecimal],
  characterLifeModifier: Option[List[Int]],
  offensiveFreezeMin: Option[BigDecimal],
  defensivePoison: Option[BigDecimal],
  defensiveTrap: Option[BigDecimal],
  skillCooldownTime: Option[BigDecimal],
  offensiveSlowRunSpeedMin: Option[BigDecimal],
  defensivePierce: Option[BigDecimal],
  offensivePhysicalModifier: Option[List[Int]],
  defensiveSlowLifeLeach: Option[BigDecimal],
  offensiveSlowOffensiveAbilityMin: Option[BigDecimal],
  offensiveSlowBleedingDurationMin: Option[BigDecimal],
  warmUpEffectAttachPoint: Option[List[String]],
  offensiveStunMin: Option[BigDecimal],
  offensiveSlowLifeMin: Option[List[Int]],
  characterDeflectProjectile: Option[BigDecimal],
  characterRunSpeedModifier: Option[BigDecimal],
  offensiveAetherMin: Option[List[Int]],
  characterSpellCastSpeedModifier: Option[BigDecimal],
  offensivePhysicalReductionPercentMin: Option[BigDecimal],
  characterDodgePercent: Option[BigDecimal],
  skillTargetRadius: Option[BigDecimal],
  offensiveChaosModifier: Option[List[Int]],
  defensiveChaos: Option[BigDecimal],
  offensiveTotalDamageModifier: Option[List[Int]],
  offensivePercentCurrentLifeMin: Option[BigDecimal],
  offensiveSlowLightningDurationMin: Option[BigDecimal],
  defensiveAether: Option[BigDecimal],
  offensiveLifeLeechMin: Option[BigDecimal],
  defensiveSlowManaLeachDuration: Option[BigDecimal],
  skillUltimateLevel: Option[BigDecimal],
  defensiveKnockdown: Option[BigDecimal],
  offensiveElementalMin: Option[BigDecimal],
  skillProjectileNumber: Option[BigDecimal],
  defensiveColdDuration: Option[BigDecimal],
  offensiveSlowTotalSpeedMin: Option[BigDecimal],
  defensiveLightningDuration: Option[BigDecimal],
  offensiveSlowRunSpeedDurationMin: Option[BigDecimal],
  defensivePhysical: Option[BigDecimal],
  offensiveSlowColdDurationMin: Option[BigDecimal],
  offensiveSlowPoisonDurationMin: Option[BigDecimal],
  defensiveTotalSpeedResistance: Option[BigDecimal],
  defensiveSlowLifeLeachDuration: Option[BigDecimal],
  defensiveFreeze: Option[BigDecimal],
  skillDisplayName: Option[String],
  skillAllowsWarmUp: Option[BigDecimal],
  buffSkillName: Option[String],
  offensiveSlowBleedingMin: Option[BigDecimal],
  offensiveSlowDefensiveAbilityMin: Option[BigDecimal],
  characterManaRegenModifier: Option[List[Int]],
  offensiveSlowLifeDurationMin: Option[BigDecimal],
  defensiveLightning: Option[BigDecimal],
  defensivePhysicalDuration: Option[BigDecimal],
  pointBlank: Option[BigDecimal],
  offensiveSlowOffensiveAbilityDurationMin: Option[BigDecimal],
  projectileLaunchNumber: Option[BigDecimal],
  defensiveManaBurn: Option[BigDecimal],
  numProjectiles: Option[BigDecimal],
  defensiveCold: Option[BigDecimal],
  retaliationLightningMin: Option[BigDecimal],
  defensivePercentReflectionResistance: Option[BigDecimal],
  defensiveSlowManaLeach: Option[BigDecimal],
  characterAttackSpeedModifier: Option[BigDecimal],
  offensiveSlowTotalSpeedDurationMin: Option[BigDecimal],
  defensiveProtection: Option[List[Int]],
  defensiveSleep: Option[BigDecimal],
  maxMoveRatio: Option[BigDecimal],
  offensiveChaosMin: Option[List[Int]],
  skillDownBitmapName: Option[String],
  offensiveTauntMin: Option[BigDecimal],
  defensiveBleedingDuration: Option[BigDecimal],
  defensiveManaBurnRatio: Option[BigDecimal],
  defensiveTaunt: Option[BigDecimal],
  defensiveFireDuration: Option[BigDecimal],
  skillUpBitmapName: Option[String],
  defensiveLife: Option[BigDecimal],
  offensiveLifeMax: Option[BigDecimal],
  defensiveBleeding: Option[BigDecimal],
  offensiveAetherMax: Option[List[Int]],
  skillMaxLevel: Option[BigDecimal],
  defensiveStun: Option[BigDecimal],
  offensiveTotalResistanceReductionAbsoluteDurationMin: Option[BigDecimal],
  offensivePhysicalReductionPercentDurationMin: Option[BigDecimal],
  offensiveCritDamageModifier: Option[List[Int]],
  defensiveLifeDuration: Option[BigDecimal],
  offensiveSlowLightningMin: GDArray[BigDecimal],
  offensiveColdMax: GDArray[BigDecimal],
  defensiveDisruption: GDArray[BigDecimal],
  offensiveTotalDamageReductionPercentDurationMin: GDArray[BigDecimal],
  offensiveSlowColdMin: GDArray[BigDecimal],
  offensivePierceMin: GDArray[BigDecimal],
  defensiveConfusion: GDArray[BigDecimal],
  offensiveLifeMin: GDArray[BigDecimal],
  weaponDamagePct: GDArray[BigDecimal],
  offensiveColdMin: GDArray[BigDecimal],
  offensivePhysicalMin: GDArray[BigDecimal],
  skillTargetNumber: GDArray[BigDecimal],
  offensiveLightningMin: GDArray[BigDecimal],
  offensiveTotalDamageReductionPercentMin: GDArray[BigDecimal],
  offensiveFireMin: GDArray[BigDecimal],
  offensivePoisonMax: GDArray[BigDecimal],
  offensivePoisonMin: GDArray[BigDecimal],
  defensiveFear: GDArray[BigDecimal],
  projectilePiercingChance: GDArray[BigDecimal],
  skillManaCost: GDArray[BigDecimal],
  offensiveSlowPoisonMin: GDArray[BigDecimal],
  offensivePhysicalMax: GDArray[BigDecimal],
  skillTargetAngle: GDArray[BigDecimal],
  defensiveConvert: GDArray[BigDecimal],
  offensiveLightningMax: GDArray[BigDecimal]
)

object spawnSkill {
  implicit val codecJson: Codec[spawnSkill] = {
    val impl = deriveCodec[spawnSkill]
    Codec.from(impl, impl.mapJson(_.dropNullValues))
  }
}
