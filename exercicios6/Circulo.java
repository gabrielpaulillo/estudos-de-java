package br.com.alura.exercicios6;

public class Circulo implements Forma {
    double raio;

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}
