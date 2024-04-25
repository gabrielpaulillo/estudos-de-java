package br.com.alura.exercicios3;

public class ProdutoFisico implements Calculavel {
    @Override
    public double calcularPrecoFinal(double precoInicial) {
        double taxaAdicional = 0.13;
        double precoFinal = precoInicial * (1 + taxaAdicional);

        return precoFinal;
    }
}
