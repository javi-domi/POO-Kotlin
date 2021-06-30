package digiOneBank.testes

import digiOneBank.Banco

fun main(){
    val digiOneBank = Banco(nome= "DigiOne", numero = 12)

    println(digiOneBank.nome)
    println(digiOneBank.numero)

    val BancoDois = digiOneBank.copy(nome = "Banco2")
    println(BancoDois.nome)
}