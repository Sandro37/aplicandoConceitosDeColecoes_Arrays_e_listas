package one.digitalinnovation.collections

fun main() {
    val values = IntArray(5)
    values[0] = 1
    values[1] = 7
    values[2] = 6
    values[3] = 3
    values[4] = 2

    println("___________________")
    for (i in values){
        println(i)
    }

    println("___________________")
    values.forEach { value ->
        println(value)
    }

    println("___________________")
    for(index in values.indices){
        println(values[index])
    }

    println("___________________")
    values.sort()
    for(valor in values){
        println(valor)
    }
}