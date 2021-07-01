package digiOneBank.testes

import digiOneBank.Cliente
import digiOneBank.ClienteTipo

fun main() {
    val luisa = Cliente(nome = "Luisa", cpf = "123.123.456.78", clienteTipo = ClienteTipo.PF, senha = "123" )

    println(luisa)

    TesteAuth().auth(luisa)
}