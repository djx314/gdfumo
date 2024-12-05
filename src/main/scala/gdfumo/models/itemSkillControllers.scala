package gdfumo

import io.circe._
import io.circe.generic.JsonCodec
import io.circe.generic.semiauto._

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
