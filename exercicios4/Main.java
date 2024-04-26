package br.com.alura.exercicios4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Exercício 1 - Pessoa
        var pessoa1 = new Pessoa("Louie", 30);

        System.out.println(pessoa1.toString());

        var pessoa2 = new Pessoa("Gabriel", 25);

        var pessoa3 = new Pessoa("Camila", 25);

//        Exercício 2
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

//        Exercício 3
        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

//        Exercício 4
        System.out.println("Tamanho da lista: " + listaDePessoas.size());

//        Exercício 5
        System.out.println("Primeira pessoa da lista: " + listaDePessoas.get(0));

//        Exercício 6
        System.out.println("Lista completa: ");
        for (Pessoa pessoa : listaDePessoas) {
            System.out.println(pessoa);
        }
    }
}
