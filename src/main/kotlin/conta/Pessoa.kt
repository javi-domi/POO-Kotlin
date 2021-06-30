package conta

class Pessoa {
    var nome: String = "Javier"
    var cpf: String = "066.029.237-81"
    private set

    inner class Enderco {
        var rua: String = "Rua Real"
    }

    constructor()

    fun uneInfo() {
        println("Nome: " + nome )
        println("CPF: " + cpf )
        println("Endereço: " + Enderco().rua)

    }
}

fun main() {
    val javier = Pessoa()
    println(javier.uneInfo())
}

