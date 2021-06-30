package conta

class Pessoa {
    var nome: String = "Javier"
    var cpf: String = "066.029.237-81"
    private set

    inner class Enderco {
        var rua: String = "Rua Real"
    }
}

fun main() {
    val javier = Pessoa()
    println("Nome: " + javier.nome )
    println("CPF: " + javier.cpf )
    println("Endereço: " + javier.Enderco().rua)
}

