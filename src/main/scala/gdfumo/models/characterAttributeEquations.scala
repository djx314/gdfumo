package gdfumo

import io.circe.Codec
import io.circe.generic.semiauto.deriveCodec
import gdfumo.datatype.StringOrElse

case class characterAttributeEquations(
  templateName: String,
  characterOffensiveAbility: String,
  characterDefensiveAbility: Option[String],
  characterLifeRegen: Option[String],
  characterManaRegen: Option[String],
  characterMana: StringOrElse[Int],
  characterLife: StringOrElse[Int],
  characterStrength: Option[StringOrElse[Int]],
  characterDexterity: Option[StringOrElse[Int]],
  characterIntelligence: Option[StringOrElse[Int]]
)

object characterAttributeEquations {
  implicit val codecJson: Codec[characterAttributeEquations] = {
    val impl = deriveCodec[characterAttributeEquations]
    Codec.from(impl, impl.mapJson(_.dropNullValues))
  }
  // val deriv: (En121[characterAttributeEquations], shapeless.HList) = En121.derived1111111122221
}
