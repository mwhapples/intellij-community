// PSI_ELEMENT: org.jetbrains.kotlin.psi.KtParameter
// OPTIONS: usages
// FIR_COMPARISON_WITH_DISABLED_COMPONENTS

data class A(val <caret>a: Int, val b: Int)

fun when1(o: Any) {
    when (o) {
        is A -> {
            val (x, y) = o
        }

        is String -> TODO()

        else -> return
    }
}

fun when2(o: Any) {
    when (o) {
        !is A -> {
        }

        else -> {
            val (x, y) = o
        }
    }
}
// FIR_COMPARISON
// IGNORE_FIR_LOG
