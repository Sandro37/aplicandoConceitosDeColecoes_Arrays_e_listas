package one.digitalinnovation.collections

fun main() {
    val nomes = Array<String>(3){""}
    nomes[0] = "Maria"
    nomes[1] = "João"
    nomes[2] = "Alex"


    nomes.forEach {
        println(it)
    }

    println("_____________________")

    for (nome in nomes){
        println(nome)
    }
    println("_____________________")

    nomes.sort()
    nomes.forEach { nome ->
        println(nome)
    }

    println("_____________________")
    val nomes2 = arrayOf("Maria", "João", "Alex", "Ricardo")

    nomes2.sort()
    nomes2.forEach { nome ->
        println(nome)
    }

}