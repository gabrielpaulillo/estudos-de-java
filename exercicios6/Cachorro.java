package br.com.alura.exercicios6;

public class Cachorro extends Animal{

    public Cachorro(int patas, String nome) {
        super(patas, nome);
    }

    @Override
    public String toString() {
        return "Nome do cachorro: " + getNome() +
                ", Número de patas: " + getPatas();
    }

    @Override
    public void emitirSom() {
        System.out.println("Au au");
    }

    public void rosnar() {
        System.out.println("Grrrrrrrrr");
    }
}
