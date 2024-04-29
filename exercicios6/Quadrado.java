package br.com.alura.exercicios6;

public class Quadrado implements Forma{
    double lado;

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
