package gdfumo

import io.circe._
import io.circe.generic.JsonCodec
import io.circe.generic.semiauto._

@JsonCodec
case class GrimTools(
  blacklistedSets: List[String],
  // 待处理
  petBonuses: Map[String, petBonuses],
  dbMasteryData: Map[String, dbMasteryData],
  factions: Map[String, factions],
  playerBio: playerBio,
  toolModVersion: None.type,
  merchants: Map[String, merchants],
  bonusTables: Map[String, Map[String, Int]],
  containerRefs: Map[String, String],
  combatformulas: combatformulas,
  itemCostFormulae: Map[String, itemCostFormulae],
  db_l10n: List[db_l10n],
  // 待处理
  itemSkills: Map[String, Map[String, Json]],
  toolModName: None.type,
  gameVersion: String,
  toolModId: None.type,
  monsters: Map[String, monsters],
  toolModClasses: None.type,
  prefixes: Map[String, prefixes],
  db_l10n_texts: db_l10n_texts,
  defaultItemCostFormula: String,
  player: player,
  merchantItems: Json,
  containers: Json,
  bonusTableAffixes: Json,
  modNameMap: Json,
  MIRefs: Json,
  versionDiffs: Json,
  shortNameMapping: Json,
  allItems: Json,
  itemSets: Json,
  suffixes: Json,
  MIs: Json,
  itemSkillControllers: Json,
  buffSkills: Json,
  uniqueRares: Json,
  engine: Json
)
