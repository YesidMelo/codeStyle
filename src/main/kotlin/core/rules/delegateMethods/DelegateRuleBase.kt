package core.rules.delegateMethods

import core.constants.Language
import core.rules.base.RuleBase

abstract class DelegateRuleBase : RuleBase() {
    companion object {
        private var currentInstance : DelegateRuleBase? = null
        fun getInstance(language: Language = Language.KOTLIN) = currentInstance
    }
}