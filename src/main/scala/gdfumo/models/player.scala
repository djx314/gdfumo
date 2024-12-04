package gdfumo

import io.circe._
import io.circe.generic.JsonCodec
import io.circe.generic.semiauto._

@JsonCodec
case class player(
  characterOffensiveAbility: Int,
  maxLevel: Int,
  masteryIncrementLevel: List[Int],
  characterAttackSpeed: BigDecimal,
  characterLifeRegen: Int,
  characterLife: Int,
  o: String,
  characterManaRegen: Int,
  characterIntelligence: Int,
  characterMana: Int,
  characterRacialProfile: String,
  characterRunSpeed: BigDecimal,
  lowHealthResetLevel: Int,
  characterGenderProfile: String,
  characterDexterity: Int,
  characterStrength: Int,
  characterSpellCastSpeed: BigDecimal,
  minLevel: Int,
  characterDefensiveAbility: Int,
  lowHealthTriggerLevel: Int,
  characterConstitution: Int,
  skillTree1: Map[String, String],
  skillTree2: Map[String, String],
  skillTree3: Map[String, String],
  skillTree4: Map[String, String],
  skillTree5: Map[String, String],
  skillTree6: Map[String, String],
  skillTree7: Map[String, String],
  skillTree8: Map[String, String],
  skillTree9: Map[String, String]
)
