package core.rules.imports

import core.constants.Language
import core.rules.base.RuleBase

abstract class ImportsRuleBase : RuleBase() {
    companion object {
        private var currentInstance : ImportsRuleBase? = null
        fun getInstance(language: Language = Language.KOTLIN) = currentInstance
    }
}