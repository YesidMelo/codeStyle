package core.rules.publicMethods

import core.constants.Language
import core.rules.base.RuleBase

abstract class PublicMethodsBaseRule : RuleBase() {
    companion object {
        private var currentInstance : PublicMethodsBaseRule? = null
        fun getInstance(language: Language = Language.KOTLIN) = currentInstance
    }
}