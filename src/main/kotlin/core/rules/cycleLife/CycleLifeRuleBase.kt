package core.rules.cycleLife

import core.constants.Language
import core.rules.base.RuleBase

abstract class CycleLifeRuleBase : RuleBase() {
    companion object {
        private var currentInstance : CycleLifeRuleBase? = null
        fun getInstance(language: Language = Language.KOTLIN) = currentInstance
    }
}