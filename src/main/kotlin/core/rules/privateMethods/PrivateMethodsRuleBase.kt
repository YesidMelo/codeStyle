package core.rules.privateMethods

import core.constants.Language
import core.rules.base.RuleBase

abstract class PrivateMethodsRuleBase : RuleBase() {

    companion object {
        private var currentInstance : PrivateMethodsRuleBase? = null
        fun getInstance(language: Language = Language.KOTLIN) = currentInstance
    }
}