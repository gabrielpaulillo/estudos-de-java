package br.com.alura.exercicios2;

public class Gato extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Miau");;
    }

    public void arranharMoveis() {
        System.out.println("*Afiando as unhas*");
    }
}
