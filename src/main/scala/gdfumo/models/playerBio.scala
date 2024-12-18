package gdfumo

import io.circe.Codec
import io.circe.generic.JsonCodec
import io.circe.generic.semiauto.deriveCodec

@JsonCodec
case class playerBio(
  maxLevel: Int,
  initialSkillPoints: Int,
  skillPointsIncrement: List[Int],
  maxSkillPoints: Int,
  attributePointsIncrement: Int,
  maxAttributePoints: Int,
  maxDevotionPoints: Int,
  strengthIncrement: Int,
  cunningIncrement: Int,
  spiritIncrement: Int,
  healthIncrement: Int,
  energyIncrement: Int,
  healthIncrementCunning: Int,
  healthIncrementSpirit: Int
)
