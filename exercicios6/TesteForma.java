package br.com.alura.exercicios6;

import java.util.ArrayList;

public class TesteForma {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        circulo.raio = 5;

        Quadrado quadrado = new Quadrado();
        quadrado.lado = 5;

        ArrayList<Forma> listaDeFormas = new ArrayList<>();
        listaDeFormas.add(circulo);
        listaDeFormas.add(quadrado);

        for (Forma forma : listaDeFormas) {
            System.out.println("Área: " + forma.calcularArea());
        }
    }
}
