package core

import core.constants.Language
import core.rules.classRule.ClassRuleBase
import core.rules.constants.ConstantsRuleBase
import core.rules.cycleLife.CycleLifeRuleBase
import core.rules.delegateMethods.DelegateRuleBase
import core.rules.imports.ImportsRuleBase
import core.rules.privateMethods.PrivateMethodsRuleBase
import core.rules.publicMethods.PublicMethodsBaseRule
import core.rules.staticRule.StaticRuleBase
import core.rules.variables.VariablesRuleBase
import core.rules.variablesUI.VariablesUIRuleBase

class Organizer constructor(
    private val language: Language = Language.KOTLIN
) {
    private val classRule = ClassRuleBase.getInstance(language = language)
    private val constantRule = ConstantsRuleBase.getInstance(language = language)
    private val cycleLifeRuleBase = CycleLifeRuleBase.getInstance(language = language)
    private val delegateRuleBase = DelegateRuleBase.getInstance(language = language)
    private val importsRuleBase = ImportsRuleBase.getInstance(language = language)
    private val privateMethodsRuleBase = PrivateMethodsRuleBase.getInstance(language = language)
    private val publicMethodsBaseRule = PublicMethodsBaseRule.getInstance(language = language)
    private val staticRuleBase = StaticRuleBase.getInstance(language = language)
    private val variablesRuleBase = VariablesRuleBase.getInstance(language = language)
    private val variablesUIRuleBase = VariablesUIRuleBase.getInstance(language = language)

    fun prepareFile() : Organizer {
        return this
    }

    fun applyRules() : Organizer {
        return this
    }

    fun finish() {

    }
}