package digiOneBank.testes

import digiOneBank.Funcionario

class PrintRelatorioFuncionario {
    companion object {
        fun printRelatorio(funcionario: Funcionario){
            println(
                funcionario.toString()
            )
        }
    }
}