// Partie 2
//  1
fun transformToUpperCase(username: String) = username.toUpperCase()

fun transformToUpperCase(username: String): String {
    return username.toUpperCase()
}
// 2
const val BEST_PROG_LANG = "kotlin"

fun main() {
    var hello = "Hello"
    hello += " world!"
    println(hello)

    var toto: String = "Toto"
    println(toto)

    var message: String? = "I'm learning kotlin!"
    message = null
    println(message.toString())
}

//3
fun sayMyName(name: String): Unit {
    println("$name")
}
//4
fun isStudent(isLearning: Boolean) = isLearning
//5
fun main(args: Array<String>) {
    val result = addition(5, 5)
    val bigResult = addition(result, addition(15, 2))
    println("Result is: $bigResult")
}

private fun addition(a: Int, b: Int) = a + b
 affiche 27

