package br.com.alura.exercicios6;

import java.util.ArrayList;

public class ContaBancaria {
    private String numeroDaConta;
    private double saldoDaConta;

    public ContaBancaria(String numeroDaConta, double saldoDaConta) {
        this.numeroDaConta = numeroDaConta;
        this.saldoDaConta = saldoDaConta;
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public double getSaldoDaConta() {
        return saldoDaConta;
    }

    public static void main(String[] args) {
        var minhaConta = new ContaBancaria ("12345-6", 1.0);
        var contaLouie = new ContaBancaria("44444-4", 130000.0);
        var contaCamila = new ContaBancaria("313131-3", 520.0);


        ArrayList<ContaBancaria> listaDeContas = new ArrayList<>();
        listaDeContas.add(minhaConta);
        listaDeContas.add(contaLouie);
        listaDeContas.add(contaCamila);

        ContaBancaria contaMaiorSaldo = listaDeContas.get(0);
        ContaBancaria contaMenorSaldo = listaDeContas.get(1);

        for (ContaBancaria conta : listaDeContas) {
            if (conta.getSaldoDaConta() < contaMenorSaldo.getSaldoDaConta()) {
                contaMenorSaldo = conta;
            }

            if (conta.getSaldoDaConta() > contaMaiorSaldo.getSaldoDaConta()) {
                contaMaiorSaldo = conta;
            }
        }

        System.out.println("Conta com menor saldo da lista: " + contaMenorSaldo.getSaldoDaConta());
        System.out.println("Conta com maior saldo da lista: " + contaMaiorSaldo.getSaldoDaConta());

    }
}
