package gdfumo

import io.circe._
import io.circe.generic.JsonCodec
import io.circe.generic.semiauto._

case class allItems_1(
  l: String,
  itemLevel: Int,
  completedRelicLevel: Option[Json],
  offensiveFireMax: Option[Json],
  offensiveSlowPoisonChance: Option[Json],
  retaliationStunChance: Option[Json],
  dlcRequirement: Option[Json],
  e: Option[Json],
  offensiveSlowColdChance: Option[Json],
  characterMeleeStrengthReqReduction: Option[Json],
  modifiedSkillName5: Option[Json],
  offensiveTotalResistanceReductionPercentChance: Option[Json],
  skillManaCostReduction: Option[Json],
  racialBonusAbsoluteDamage: Option[Json],
  transmuteDbrs: Option[Json],
  characterConstitutionModifier: Option[Json],
  offensiveSlowLightningMin: Option[Json],
  offensiveBaseChaosMax: Option[Json],
  offensivePierceMax: Option[Json],
  reagentBaseQuantity: Option[Json],
  retaliationFireModifier: Option[Json],
  retaliationSlowAttackSpeedMin: Option[Json],
  offensiveSlowFireDurationMin: Option[Json],
  offensiveColdGlobal: Option[Json],
  fromBlacksmith: Option[Json],
  experienceBonus: Option[Json],
  offensiveLifeModifier: Option[Json],
  offensiveKnockdownChance: Option[Json],
  infiniteUse: Option[Json],
  offensiveSlowColdModifierChance: Option[Json],
  defensivePercentCurrentLife: Option[Json],
  defensivePoisonDuration: Option[Json],
  fullBitmap: Option[Json],
  offensiveSlowDefensiveAbilityDurationMin: Option[Json],
  offensiveFireMin: Option[Json],
  offensiveStunChance: Option[Json],
  offensivePoisonMax: Option[Json],
  racialBonusPercentDamage: Option[Json],
  offensiveBonusPhysicalMax: Option[Json],
  offensiveSlowBleedingChance: Option[Json],
  conversionOutType2: Option[Json],
  defensivePhysicalChance: Option[Json],
  offensiveColdModifier: Option[Json],
  offensiveConfusionChance: Option[Json],
  characterDefensiveAbility: Option[Json],
  augmentSkillLevel1: Option[Json],
  offensiveTotalResistanceReductionAbsoluteMin: Option[Json],
  reagent2BaseName: Option[Json],
  offensiveColdMax: Option[Json],
  offensiveGlobalChance: Option[Json],
  defensiveProtectionModifier: Option[Json],
  n: Option[Json],
  offensiveChaosMax: Option[Json],
  augmentSkillName2: Option[Json],
  defensiveAetherMaxResist: Option[Json],
  defensiveFire: Option[Json],
  offensiveLightningModifierChance: Option[Json],
  defensivePetrify: Option[Json],
  characterLifeModifier: Option[Json],
  offensiveLightningGlobal: Option[Json],
  offensiveSlowFireMin: Option[Json],
  defensiveBlockAmountModifier: Option[Json],
  offensiveFireModifierChance: Option[Json],
  offensiveSlowLifeDurationModifier: Option[Json],
  defensiveLifeMaxResist: Option[Json],
  defensiveLightningMaxResist: Option[Json],
  defensivePoison: Option[Json],
  defensiveElementalResistanceChance: Option[Json],
  defensiveTrap: Option[Json],
  modifierSkillName2: Option[Json],
  questFile5: Option[Json],
  offensiveSlowAttackSpeedDurationMin: Option[Json],
  offensiveFireModifier: Option[Json],
  offensiveColdModifierChance: Option[Json],
  characterLifeRegen: Option[Json],
  offensiveFreezeMin: Option[Json],
  offensiveTotalDamageReductionPercentChance: Option[Json],
  offensiveSlowPhysicalDurationModifier: Option[Json],
  defensiveDisruption: Option[Json],
  artifactCreationCost: Option[Json],
  characterDexterityModifier: Option[Json],
  defensiveFireMaxResist: Option[Json],
  offensiveSlowRunSpeedMin: Option[Json],
  defensivePierce: Option[Json],
  retaliationColdMax: Option[Json],
  offensiveTotalDamageReductionPercentDurationMin: Option[Json],
  offensiveBaseLifeMin: Option[Json],
  racialBonusRace: Option[Json],
  reagent1Quantity: Option[Json],
  offensivePhysicalModifier: Option[Json],
  defensiveSlowLifeLeach: Option[Json],
  retaliationFearMin: Option[Json],
  augmentMasteryLevel2: Option[Json],
  blockRecoveryTime: Option[Json],
  offensivePhysicalModifierChance: Option[Json],
  factionSource: Option[Json],
  untradeable: Option[Json],
  offensiveBasePoisonMin: Option[Json],
  offensiveSlowLifeModifier: Option[Json],
  hideLegs: Option[Json],
  augmentAllLevel: Option[Json],
  itemSkillLevelEq: Option[Json],
  f: Option[Json],
  characterWeaponStrengthReqReduction: Option[Json],
  retaliationFireMin: Option[Json],
  offensiveSlowBleedingDurationMin: Option[Json],
  augmentMasteryLevel1: Option[Json],
  offensivePoisonModifier: Option[Json],
  offensiveSlowPoisonModifier: Option[Json],
  offensiveLightningModifier: Option[Json],
  retaliationPoisonMin: Option[Json],
  defensiveChaosMaxResist: Option[Json],
  offensiveSlowColdMin: Option[Json],
  itemSkillName: Option[Json],
  replacementAnimsMale: Option[Json],
  modifiedSkillName2: Option[Json],
  retaliationSlowManaLeachDurationMin: Option[Json],
  characterLifeRegenModifier: Option[Json],
  questFile4: Option[Json],
  reagent5BaseName: Option[Json],
  characterEnergyAbsorptionPercent: Option[Json],
  retaliationPoisonModifier: Option[Json],
  offensiveStunMin: Option[Json],
  reagent4Quantity: Option[Json],
  offensivePierceMin: Option[Json],
  offensiveKnockdownMin: Option[Json],
  offensiveFreezeChance: Option[Json],
  characterArmorStrengthReqReduction: Option[Json],
  onDrop: Option[Json],
  augmentSkillLevel2: Option[Json],
  offensivePhysicalChance: Option[Json],
  retaliationFearChance: Option[Json],
  characterManaRegen: Option[Json],
  offensiveBaseFireMin: Option[Json],
  factions: Option[Json],
  characterDeflectProjectile: Option[Json],
  characterRunSpeedModifier: Option[Json],
  a: Option[Json],
  offensiveSlowLifeMin: Option[Json],
  modifierSkillName1: Option[Json],
  offensiveAetherMin: Option[Json],
  characterSpellCastSpeedModifier: Option[Json],
  defensiveBlockChance: Option[Json],
  offensivePhysicalReductionPercentMin: Option[Json],
  characterDodgePercent: Option[Json],
  defensiveColdMaxResist: Option[Json],
  offensiveSlowLightningDurationModifier: Option[Json],
  offensiveSlowManaLeachDurationMin: Option[Json],
  characterDefensiveAbilityModifier: Option[Json],
  offensiveSlowPhysicalDurationMin: Option[Json],
  MI: Option[Json],
  offensiveSlowLightningModifierChance: Option[Json],
  itemQualityTag: Option[Json],
  offensiveSlowManaLeachMin: Option[Json],
  templateName: Option[Json],
  offensiveConfusionMin: Option[Json],
  m: Option[Json],
  strengthRequirement: Option[Json],
  offensivePoisonMin: Option[Json],
  retaliationTotalDamageModifier: Option[Json],
  offensiveAetherModifierChance: Option[Json],
  offensiveTotalResistanceReductionAbsoluteChance: Option[Json],
  offensiveChaosModifier: Option[Json],
  offensiveSlowPhysicalMax: Option[Json],
  augmentSkillName1: Option[Json],
  offensiveBaseColdMin: Option[Json],
  offensivePercentCurrentLifeMin: Option[Json],
  offensiveSlowLightningDurationMin: Option[Json],
  characterMana: Option[Json],
  defensiveChaos: Option[Json],
  modifierSkillName5: Option[Json],
  offensiveTotalDamageModifier: Option[Json],
  offensivePierceChance: Option[Json],
  offensiveSlowBleedingMax: Option[Json],
  retaliationFreezeMin: Option[Json],
  artifactName: Option[Json],
  offensiveTotalResistanceReductionPercentMin: Option[Json],
  offensiveChaosChance: Option[Json],
  defensiveAether: Option[Json],
  offensiveSlowFireModifier: Option[Json],
  offensiveLifeLeechMin: Option[Json],
  skillProjectileSpeedModifier: Option[Json],
  blockAbsorption: Option[Json],
  characterLife: Option[Json],
  retaliationStunMin: Option[Json],
  mods: Option[Json],
  offensiveBaseColdMax: Option[Json],
  retaliationLifeMin: Option[Json],
  offensiveSlowPoisonMin: Option[Json],
  conversionInType: Option[Json],
  hideShoulders: Option[Json],
  offensiveSlowBleedingDurationModifier: Option[Json],
  defensiveBlock: Option[Json],
  artifactClassification: Option[Json],
  offensiveLifeMin: Option[Json]
)
object allItems_1 {
  implicit val codecJson: Codec.AsObject[allItems_1] = deriveCodec
}

case class allItems_2(
  taskUID4: Option[Json],
  modifiedSkillName3: Option[Json],
  offensiveSlowRunSpeedChance: Option[Json],
  defensivePoisonMaxResist: Option[Json],
  retaliationPhysicalMax: Option[Json],
  offensiveElementalMin: Option[Json],
  offensivePierceRatioModifier: Option[Json],
  transmuteTag: Option[Json],
  offensiveSlowPhysicalChance: Option[Json],
  defensiveBleedingMaxResist: Option[Json],
  offensiveSlowPhysicalMin: Option[Json],
  characterIncreasedExperience: Option[Json],
  retaliationPoisonMax: Option[Json],
  offensiveFumbleMin: Option[Json],
  offensiveSlowPhysicalModifier: Option[Json],
  characterLightRadius: Option[Json],
  skillName: Option[Json],
  offensiveTotalDamageModifierChance: Option[Json],
  reagent3BaseName: Option[Json],
  retaliationSlowPoisonMin: Option[Json],
  reagentBaseBaseName: Option[Json],
  offensiveSlowBleedingModifierChance: Option[Json],
  retaliationPhysicalChance: Option[Json],
  defensiveFreezeChance: Option[Json],
  defensiveColdDuration: Option[Json],
  skillCooldownReduction: Option[Json],
  augmentSkillLevel3: Option[Json],
  offensiveSlowLifeChance: Option[Json],
  retaliationFreezeChance: Option[Json],
  offensiveSlowTotalSpeedMin: Option[Json],
  defensiveLightningDuration: Option[Json],
  modifiedSkillName1: Option[Json],
  b: Option[Json],
  offensiveSlowRunSpeedDurationMin: Option[Json],
  retaliationLightningModifier: Option[Json],
  offensiveTotalResistanceReductionPercentDurationMin: Option[Json],
  artifactCreateQuantity: Option[Json],
  conversionOutType: Option[Json],
  forcedRelicCompletion: Option[Json],
  offensiveBasePoisonMax: Option[Json],
  defensivePhysical: Option[Json],
  offensiveStunModifier: Option[Json],
  offensiveSlowColdDurationMin: Option[Json],
  retaliationSlowLightningDurationMin: Option[Json],
  retaliationSlowLightningMin: Option[Json],
  g: Option[Json],
  offensiveSlowPoisonDurationMin: Option[Json],
  defensiveBlockModifier: Option[Json],
  defensiveTotalSpeedResistance: Option[Json],
  alternateMesh: Option[Json],
  characterHealIncreasePercent: Option[Json],
  retaliationFireMax: Option[Json],
  offensiveBaseLifeMax: Option[Json],
  retaliationLightningMax: Option[Json],
  defensiveFreeze: Option[Json],
  modifierSkillName4: Option[Json],
  characterIntelligenceModifier: Option[Json],
  offensiveElementalMax: Option[Json],
  retaliationSlowManaLeachMin: Option[Json],
  retaliationSlowPoisonDurationMin: Option[Json],
  bitmapFemale: Option[Json],
  offensiveBaseLightningMin: Option[Json],
  p: Option[Json],
  replacementAnimsFemale: Option[Json],
  offensiveBaseLightningMax: Option[Json],
  offensiveSlowBleedingMin: Option[Json],
  offensivePhysicalMax: Option[Json],
  defensivePierceMaxResist: Option[Json],
  retaliationPoisonChance: Option[Json],
  offensiveSlowDefensiveAbilityMin: Option[Json],
  offensiveSlowFireChance: Option[Json],
  cls: Option[Json],
  characterManaRegenModifier: Option[Json],
  retaliationSlowLightningChance: Option[Json],
  offensiveSlowLifeDurationMin: Option[Json],
  taskUID5: Option[Json],
  offensiveSlowColdDurationModifier: Option[Json],
  characterStrengthModifier: Option[Json],
  offensiveSlowManaLeachChance: Option[Json],
  augmentSkillLevel4: Option[Json],
  offensiveColdMin: Option[Json],
  retaliationTotalDamageModifierChance: Option[Json],
  retaliationConfusionChance: Option[Json],
  offensiveSlowTotalSpeedChance: Option[Json],
  retaliationColdMin: Option[Json],
  augmentMasteryName3: Option[Json],
  offensiveElementalModifier: Option[Json],
  defensiveLightning: Option[Json],
  offensiveSlowLightningChance: Option[Json],
  conversionPercentage: Option[Json],
  characterHuntingDexterityReqReduction: Option[Json],
  reagent5Quantity: Option[Json],
  offensiveBonusPhysicalMin: Option[Json],
  offensiveBaseAetherMin: Option[Json],
  characterMeleeIntelligenceReqReduction: Option[Json],
  retaliationPhysicalMin: Option[Json],
  maxStackSize: Option[Json],
  augmentMasteryName1: Option[Json],
  offensiveSlowAttackSpeedMin: Option[Json],
  offensiveFireGlobal: Option[Json],
  offensiveSlowFireGlobal: Option[Json],
  offensiveSlowColdGlobal: Option[Json],
  offensiveBaseFireMax: Option[Json],
  offensiveSlowPoisonDurationModifier: Option[Json],
  characterTotalSpeedModifier: Option[Json],
  characterManaModifier: Option[Json],
  defensiveCold: Option[Json],
  retaliationLightningMin: Option[Json],
  defensivePercentReflectionResistance: Option[Json],
  itemSkillAutoController: Option[Json],
  characterAttackSpeedModifier: Option[Json],
  offensiveSlowTotalSpeedDurationMin: Option[Json],
  offensivePhysicalMin: Option[Json],
  defensiveProtection: Option[Json],
  h: Option[Json],
  defensiveSlowManaLeach: Option[Json],
  racialBonusPercentDefense: Option[Json],
  conversionPercentage2: Option[Json],
  offensiveSlowLightningGlobal: Option[Json],
  characterLevelReqReduction: Option[Json],
  offensiveBaseChaosMin: Option[Json],
  `type`: Option[Json],
  offensiveChaosMin: Option[Json],
  retaliationElementalMin: Option[Json],
  augmentSkillName4: Option[Json],
  reagent4BaseName: Option[Json],
  defensiveBonusProtection: Option[Json],
  offensiveSlowDefensiveAbilityChance: Option[Json],
  retaliationSlowFireMin: Option[Json],
  offensiveSlowColdModifier: Option[Json],
  characterStrength: Option[Json],
  defensiveBleedingDuration: Option[Json],
  characterOffensiveAbility: Option[Json],
  offensiveSlowFireModifierChance: Option[Json],
  offensiveSlowFireDurationModifier: Option[Json],
  offensiveAetherModifier: Option[Json],
  defensiveProtectionChance: Option[Json],
  characterDexterity: Option[Json],
  defensiveBleedingDurationModifier: Option[Json],
  offensivePoisonChance: Option[Json],
  defensiveLife: Option[Json],
  retaliationAetherMin: Option[Json],
  offensiveBaseAetherMax: Option[Json],
  modifierSkillName3: Option[Json],
  defensiveFireDuration: Option[Json],
  conversionInType2: Option[Json],
  offensiveSlowLightningModifier: Option[Json],
  offensiveSlowFireMax: Option[Json],
  offensiveLightningMin: Option[Json],
  k: Option[Json],
  characterIntelligence: Option[Json],
  reagent2Quantity: Option[Json],
  offensiveAetherMax: Option[Json],
  uniqueRare: Option[Json],
  offensivePierceModifier: Option[Json],
  retaliationSlowFireDurationMin: Option[Json],
  characterDefensiveBlockRecoveryReduction: Option[Json],
  offensiveLifeMax: Option[Json],
  characterOffensiveAbilityModifier: Option[Json],
  retaliationSlowAttackSpeedDurationMin: Option[Json],
  defensiveBleeding: Option[Json],
  defensiveAllMaxResist: Option[Json],
  defensiveStun: Option[Json],
  bonusTableName: Option[Json],
  defensiveAbsorptionModifier: Option[Json],
  offensiveFumbleDurationMin: Option[Json],
  offensivePierceRatioMin: Option[Json],
  offensiveTotalResistanceReductionAbsoluteDurationMin: Option[Json],
  augmentSkillName3: Option[Json],
  retaliationConfusionMin: Option[Json],
  petBonusName: Option[Json],
  itemStyleTag: Option[Json],
  offensiveSlowBleedingModifier: Option[Json],
  augmentMasteryName2: Option[Json],
  reagent1BaseName: Option[Json],
  offensiveTotalDamageReductionPercentMin: Option[Json],
  offensivePhysicalReductionPercentDurationMin: Option[Json],
  o: Option[Json],
  augmentMasteryLevel3: Option[Json],
  offensiveCritDamageModifier: Option[Json],
  characterMeleeDexterityReqReduction: Option[Json],
  reagent3Quantity: Option[Json],
  defensiveElementalResistance: Option[Json],
  modifiedSkillName4: Option[Json],
  hideFeet: Option[Json],
  d: Option[Json],
  offensiveSlowLightningMax: Option[Json],
  offensiveLightningMax: Option[Json]
)
object allItems_2 {
  implicit val codecJson: Codec.AsObject[allItems_2] = deriveCodec
}

case class allItems_compat(item1: allItems_1, item2: allItems_2)
object allItems_compat {
  val encodeJson: Encoder.AsObject[allItems_compat] = {
    val enc1: Encoder.AsObject[allItems_1] = implicitly
    val enc2: Encoder.AsObject[allItems_2] = implicitly
    Encoder.AsObject.instance { a =>
      val t1: JsonObject = enc1.encodeObject(a.item1)
      val t2: JsonObject = enc2.encodeObject(a.item2)
      JsonObject.fromIterable(t1.toVector ++ t2.toVector)
    }
  }

  val decodeJson: Decoder[allItems_compat] = {
    val dec1: Decoder[allItems_1] = implicitly
    val dec2: Decoder[allItems_2] = implicitly
    Decoder.instance { a =>
      for {
        x1 <- a.as[allItems_1](dec1)
        x2 <- a.as[allItems_2](dec2)
      } yield allItems_compat(item1 = x1, item2 = x2)
    }
  }

  implicit val codecJson: Codec[allItems_compat] = Codec.from(decodeJson, encodeJson.mapJson(_.dropNullValues))
}