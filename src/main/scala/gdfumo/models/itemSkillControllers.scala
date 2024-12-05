package gdfumo

import io.circe.Codec
import io.circe.generic.JsonCodec
import io.circe.generic.semiauto.deriveCodec

case class itemSkillControllers(
  chanceToRun: Int,
  templateName: String,
  targetType: String,
  triggerType: String,
  triggerParam: Option[Int]
)

object itemSkillControllers {
  implicit val codecJson: Codec[itemSkillControllers] = {
    val impl = deriveCodec[itemSkillControllers]
    Codec.from(impl, impl.mapJson(_.dropNullValues))
  }
}
