package core.keyWorlds

import core.constants.Language
import core.keyWorlds.programLanguages.KotlinLanguage

abstract class KeyWorlds {
    abstract fun getKeyWorlds() : List<String>

    companion object{
        private var currentInstance : KeyWorlds = KotlinLanguage()
        fun getCurrentInstance(language: Language = Language.KOTLIN) = currentInstance
    }
}