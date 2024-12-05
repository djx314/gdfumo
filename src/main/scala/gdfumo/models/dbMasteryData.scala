package gdfumo

import io.circe.Codec
import io.circe.generic.JsonCodec
import io.circe.generic.semiauto.deriveCodec

case class dbMasteryData(name: String, isTransmuter: Option[Boolean], isMastery: Option[Boolean])
object dbMasteryData {
  implicit val codecJson: Codec[dbMasteryData] = {
    val impl = deriveCodec[dbMasteryData]
    Codec.from(impl, impl.mapJson(_.dropNullValues))
  }
}
