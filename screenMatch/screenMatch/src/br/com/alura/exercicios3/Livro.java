package br.com.alura.exercicios3;

public class Livro implements Calculavel {
    @Override
    public double calcularPrecoFinal(double precoInicial) {
        double desconto = 0.1;
        double precoFinal = precoInicial * (1 - desconto);

        return precoFinal;
    }
}
