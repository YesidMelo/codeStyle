package core.rules.staticRule

import core.constants.Language
import core.rules.base.RuleBase

abstract class StaticRuleBase : RuleBase() {
    companion object {
        private var currentInstance : StaticRuleBase? = null
        fun getInstance(language: Language = Language.KOTLIN) = currentInstance
    }
}