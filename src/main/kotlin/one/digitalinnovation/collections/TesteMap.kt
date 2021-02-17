package one.digitalinnovation.collections

fun main() {
    val pair: Pair<String, Double> = Pair("Joao", 1000.0)
    val map1 = mapOf(pair)

    map1.forEach { (chave, valor) -> println("CHAVE: $chave - VALOR: $valor")  }

    println("____________________________")
    val map2 = mapOf(
        "Pedro" to  2500.0,
        "Maria" to 3000.0,
        "Alex" to 500.0,
        "Ricardo" to 6000.0
    )

    map2.forEach { (chave, valor) -> println("CHAVE: $chave - VALOR: $valor") }

}