package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("João", 2000.0,"CLT")
    val pedro = Funcionario("Pedro", 1500.0, "PJ")
    val maria = Funcionario("Maria", 4000.0,"CLT")

    val funcionarios = mutableListOf<Funcionario>(joao, maria)

    println("___________LIST______________")
    funcionarios.forEach { println(it) }

    println("_____________________________")
    funcionarios.add(pedro)
    funcionarios.forEach { println(it) }

    println("_____________________________")
    funcionarios.remove(joao)
    funcionarios.forEach { println(it) }

    println("____________SET______________")
    val funcionariosSet = mutableSetOf<Funcionario>(joao)
    funcionariosSet.forEach { println(it) }

    println("_____________________________")
    funcionariosSet.add(pedro)
    funcionariosSet.add(maria)
    funcionariosSet.forEach { println(it) }

    println("_____________________________")
    funcionariosSet.remove(maria)
    funcionariosSet.forEach { println(it) }
}