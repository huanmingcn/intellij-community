// IGNORE_FE10
// WITH_STDLIB
// AFTER-WARNING: Variable 'v' is never used
import java.util.ArrayList

fun f() {
    val v : List<List<Int>> = ArrayList<caret>(listOf())
}
