package core.rules.base

abstract class RuleBase {
    abstract fun startOrdered(vararg listStrings :String) : RuleBase
    abstract fun result() : List<String>
}