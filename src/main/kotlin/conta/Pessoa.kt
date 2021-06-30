package conta

class Pessoa {
    val nome: String = "Javier"
    val cpf: String = "066.029.237-81"
}

fun main() {
    val javier = Pessoa()
    println("Nome: " + javier.nome )
    println("CPF: " + javier.cpf )
}