package br.com.alura.exercicios6;

import java.util.ArrayList;

public class TesteAnimal {
    public static void main(String[] args) {
        Cachorro louie = new Cachorro(3, "Louie");
        Animal animal1 = louie;
        Animal paulo = new Animal(4, "Paulo");

        ArrayList<Animal> animais = new ArrayList<>();
        animais.add(louie);
        animais.add(paulo);
        for (Animal animal : animais) {
            if (animal instanceof Cachorro) {
                System.out.println(animal);
            }
        }
    }
}
