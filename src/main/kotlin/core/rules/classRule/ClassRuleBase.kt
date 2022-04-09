package core.rules.classRule

import core.constants.Language
import core.rules.base.RuleBase

abstract class ClassRuleBase : RuleBase() {

    companion object {
        private var currentInstance : ClassRuleBase? = null
        fun getInstance(language: Language = Language.KOTLIN) = currentInstance
    }
}