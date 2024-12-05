package gdfumo

import io.circe.Codec
import io.circe.generic.JsonCodec
import io.circe.generic.semiauto.deriveCodec

case class itemCostFormulae(
  armorCostEquation: String,
  offhandCostEquation: Option[String],
  melee2hStrengthEquation: Option[String],
  ringIntelligenceEquation: Option[String],
  weaponMelee2hCostEquation: Option[String],
  maceStrengthEquation: Option[String],
  weaponRangedCostEquation: Option[String],
  weaponCostEquation: Option[String],
  waistStrengthEquation: Option[String],
  offhandIntelligenceEquation: Option[String],
  headStrengthEquation: Option[String],
  headIntelligenceEquation: Option[String],
  daggerIntelligenceEquation: Option[String],
  feetStrengthEquation: Option[String],
  scepterStrengthEquation: Option[String],
  handsStrengthEquation: Option[String],
  shieldStrengthEquation: Option[String],
  chestStrengthEquation: Option[String],
  jewelryCostEquation: Option[String],
  scepterIntelligenceEquation: Option[String],
  shouldersStrengthEquation: Option[String],
  chestIntelligenceEquation: Option[String],
  ranged2hDexterityEquation: Option[String],
  axeStrengthEquation: Option[String],
  daggerDexterityEquation: Option[String],
  ranged1hDexterityEquation: Option[String],
  legsStrengthEquation: Option[String],
  weaponRanged2hCostEquation: Option[String],
  swordDexterityEquation: Option[String],
  shieldCostEquation: Option[String],
  amuletIntelligenceEquation: Option[String]
)
object itemCostFormulae {
  implicit val codecJson: Codec[itemCostFormulae] = {
    val impl = deriveCodec[itemCostFormulae]
    Codec.from(impl, impl.mapJson(_.dropNullValues))
  }
}
