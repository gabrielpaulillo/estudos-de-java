package br.com.alura.exercicios2;

public class Main {
    public static void main(String[] args) {
//        Exercício 1
//        ModeloCarro carro1 = new ModeloCarro();
//        carro1.definirModelo("Camaro");
//        carro1.definirPrecos(12000, 7500, 3000);
//        carro1.exibirInformacoes();
//        carro1.setCor("Amarela");
//        carro1.exibirACor();

//        Exercício 2
//        Cachorro cachorro = new Cachorro();
//        cachorro.emitirSom();
//        cachorro.abanarRabo();
//
//        Gato gato = new Gato();
//        gato.emitirSom();
//        gato.arranharMoveis();

//        Exercício 3
//        ContaCorrente minhaConta = new ContaCorrente();
//        minhaConta.consultarSaldo();
//        minhaConta.depositar(3200);
//        minhaConta.sacar(3250);
//        minhaConta.consultarSaldo();
//        minhaConta.cobrarTarifaMensal(17.50);
//        minhaConta.cobrarTarifaMensal(17.50);
//        minhaConta.cobrarTarifaMensal(17.50);

//        Exercício 4
        VerificadorPrimo verificador = new VerificadorPrimo();
        verificador.verificarSeEhPrimo(17);

        GeradorPrimo gerador = new GeradorPrimo();
        int ultimoPrimoConhecido = 19;
        int proximoPrimo = gerador.gerarProximoPrimo(ultimoPrimoConhecido);
        System.out.println("O próximo primo conhecido após " + ultimoPrimoConhecido + " é: " + proximoPrimo);

        NumerosPrimos numeroPrimo = new NumerosPrimos();
        numeroPrimo.verificarPrimalidade(28);
        numeroPrimo.listarPrimos(37);
    }
}
