package core.rules.constants

import core.constants.Language
import core.rules.base.RuleBase

abstract class ConstantsRuleBase : RuleBase() {

    companion object {
        private var currentInstance : ConstantsRuleBase? = null
        fun getInstance(language: Language = Language.KOTLIN) = currentInstance
    }
}