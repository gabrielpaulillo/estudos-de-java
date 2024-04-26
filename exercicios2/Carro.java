package br.com.alura.exercicios2;

public class Carro {
    private String modelo;
    private double precoAno1;
    private double precoAno2;
    private double precoAno3;

    public void definirModelo(String modelo) {
        this.modelo = modelo;
    }

    public void definirPrecos(double precoAno1, double precoAno2, double precoAno3) {
        this.precoAno1 = precoAno1;
        this.precoAno2 = precoAno2;
        this.precoAno3 = precoAno3;
    }

    public void exibirInformacoes() {
        System.out.println("Modelo do carro: " + this.modelo);
        System.out.println("Preço no 1o ano: R$ " + this.precoAno1);
        System.out.println("Preço no 2o ano: R$ " + this.precoAno2);
        System.out.println("Preço no 3o ano: R$ " + this.precoAno3);
        System.out.println("Maior preço: R$ " + calcularMaiorPreco());
        System.out.println("Menor preço: R$ " + calcularMenorPreco());
    }

    public double calcularMenorPreco() {
        double menorPreco = precoAno1;

        if (precoAno2 < menorPreco) {
            menorPreco = precoAno2;
        }

        if (precoAno3 < menorPreco) {
            menorPreco = precoAno3;
        }

        return menorPreco;
    }

    public double calcularMaiorPreco() {
        double maiorPreco = precoAno1;

        if (precoAno2 > maiorPreco) {
            maiorPreco = precoAno2;
        }

        if (precoAno3 > maiorPreco) {
            maiorPreco = precoAno3;
        }

        return maiorPreco;
    }
}
