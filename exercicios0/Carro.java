package br.com.alura.exercicios0;

public class Carro {
    String modelo;
    int ano;
    String cor;

    void exibirFichaTecnica() {
        System.out.println("Modelo do carro: " + modelo);
        System.out.println("Ano do carro: " + ano);
        System.out.println("Cor do carro: " + cor);
    }

    int exibirIdadeCarro() {
        return 2024 - ano;
    }
}
