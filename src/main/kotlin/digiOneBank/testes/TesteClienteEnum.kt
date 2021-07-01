package digiOneBank.testes

import digiOneBank.ClienteTipo

fun main() {
    ClienteTipo.values().forEach{ elemento ->

        println("${elemento.name} - ${elemento.descricao}")

    }
}