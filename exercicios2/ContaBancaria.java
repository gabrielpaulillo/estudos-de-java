package br.com.alura.exercicios2;

public class ContaBancaria {
    protected double saldo;

    public void depositar(double deposito) {
        saldo += deposito;
        System.out.println("Você depositou com sucesso o valor de R$ " + deposito + ". Saldo atual de: " + saldo);
    }

    public void sacar(double quantia) {
        if (quantia <= saldo) {
            saldo -= quantia;
            System.out.println("Valor sacado: " + quantia + ". Saldo atual de: " + saldo);
        } else {
            System.out.println("Valor inserido insuficiente. Tente novamente!");
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual: " + saldo);
    }
}
