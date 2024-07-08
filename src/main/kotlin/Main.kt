package org.conditions

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    print("Digite um número inteiro: ")
    val numInt = readLine()?.toInt()

    print("Digite um número decimal: ")
    val numDecimal = readLine()?.toBigDecimal()

    print("Digite uma string que represente uma cor: ")
    val valueString = readLine()

    print("Digite um caractere: ")
    val valueCaractere = readLine()

    print("Digite um número valor monetario: ")
    val numMon = readLine()?.toBigDecimal()


    if (numInt != null) {
        if(numInt > 100)
            println("Número é maior que 100")
        else if (numInt <= 100 && numInt > 50)
            println("Número está entre 51 e 100")
        else if (numInt <= 50 && numInt > 0)
            println("Número está entre 1 e 50")
        else
            println("Número é zero ou negativo")
    }

}