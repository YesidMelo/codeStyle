package core.rules.variables

import core.constants.Language
import core.rules.base.RuleBase

abstract class VariablesRuleBase : RuleBase() {
    companion object {
        private var currentInstance : VariablesRuleBase? = null
        fun getInstance(language: Language = Language.KOTLIN) = currentInstance
    }
}