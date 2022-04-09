package core.rules.variablesUI

import core.constants.Language
import core.rules.base.RuleBase

abstract class VariablesUIRuleBase : RuleBase() {
    companion object {
        private var currentInstance : VariablesUIRuleBase? = null
        fun getInstance(language: Language = Language.KOTLIN) = currentInstance
    }
}