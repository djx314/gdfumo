package gdfumo

import io.circe.Codec
import io.circe.generic.JsonCodec
import io.circe.generic.semiauto.deriveCodec

case class versionDiffs(
  mod: Option[String],
  items: List[String],
  prefixes: List[String],
  suffixes: List[String],
  itemSets: List[String],
  MIs: List[String],
  uniqueRares: List[String]
)

object versionDiffs {
  implicit val codecJson: Codec[versionDiffs] = {
    val impl = deriveCodec[versionDiffs]
    Codec.from(impl, impl.mapJson(_.dropNullValues))
  }
}
