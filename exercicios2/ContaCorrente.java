package br.com.alura.exercicios2;

public class ContaCorrente extends ContaBancaria {
    private int mes = 1;
    public void cobrarTarifaMensal(double tarifaMensal) {
        this.saldo -= tarifaMensal;
        System.out.println("Passou " + mes + " mês e a tarifa já foi descontada. Seu saldo atualizado: " + saldo);
        mes++;
    }
}
