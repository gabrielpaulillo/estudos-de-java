package br.com.alura.exercicios2;

public class ModeloCarro extends Carro {
    private String cor;

    public void exibirACor() {
        System.out.println("A cor do carro é: " + cor);
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
