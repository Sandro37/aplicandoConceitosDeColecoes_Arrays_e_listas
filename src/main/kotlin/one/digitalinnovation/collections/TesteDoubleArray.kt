package one.digitalinnovation.collections

fun main() {
    val salarios = DoubleArray(3)

    salarios[0] = 1000.0
    salarios[1] = 3000.0
    salarios[2] = 500.0

    salarios.forEach { println(it) }

    println("________________________")

    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * 1.1
    }
    salarios.forEach { println(it) }

    println("________________________")

    val salarios2 = doubleArrayOf(2000.0, 4000.0, 1500.0)
    salarios2.sort()
    salarios2.forEach { println(it) }
}