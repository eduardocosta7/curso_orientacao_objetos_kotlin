package br.com.trilhaKotlin.colecoes.parte1.array.teste

fun testaForEForeach() {
    val salarios = doubleArrayOf(1500.50, 2300.0, 5000.0, 8000.0, 10000.0)

    val aumento = 1.1
    for (indice in salarios.indices) {
        salarios[indice] *= aumento
    }
    println(salarios.contentToString())

    salarios.forEachIndexed { i, salario ->
        salarios[i] *= aumento
    }
    println(salarios.contentToString())
}