package gdfumo

import io.circe._
import io.circe.generic.JsonCodec
import io.circe.generic.semiauto._

@JsonCodec
case class GrimTools(
  blacklistedSets: List[String],
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
  itemSkills: Map[String, itemSkills_compat],
  toolModName: None.type,
  gameVersion: String,
  toolModId: None.type,
  monsters: Map[String, monsters],
  toolModClasses: None.type,
  prefixes: Map[String, prefixes],
  db_l10n_texts: db_l10n_texts,
  defaultItemCostFormula: String,
  player: player,
  merchantItems: Map[String, List[String]],
  containers: Map[String, containers],
  bonusTableAffixes: Map[String, bonusTableAffixes],
  modNameMap: modNameMap,
  MIRefs: Map[String, List[String]],
  versionDiffs: Map[String, versionDiffs],
  shortNameMapping: Map[String, String],
  allItems: Map[String, allItems_compat],
  itemSets: Map[String, itemSets],
  suffixes: Map[String, suffixes],
  MIs: List[String],
  itemSkillControllers: Map[String, itemSkillControllers],
  buffSkills: Map[String, buffSkills],
  uniqueRares: List[String],
  engine: engine
)
