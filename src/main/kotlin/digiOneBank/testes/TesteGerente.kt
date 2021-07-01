package digiOneBank.testes


import digiOneBank.Gerente


fun main() {
    val pedro = Gerente("Pedro", "34523894745", 6000.56)

    PrintRelatorioFuncionario.printRelatorio(pedro)

}