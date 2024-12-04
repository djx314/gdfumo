package gdfumo

import io.circe._
import io.circe.generic.JsonCodec
import io.circe.generic.semiauto._

case class dbMasteryData(name: String, isTransmuter: Option[Boolean], isMastery: Option[Boolean])
object dbMasteryData {
  implicit val codecJson: Codec[dbMasteryData] = {
    val impl = deriveCodec[dbMasteryData]
    Codec.from(impl, impl.mapJson(_.dropNullValues))
  }
}
