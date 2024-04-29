package br.com.alura.exercicios7;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Titulo implements Comparable<Titulo>{
    private String nome;

    public Titulo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Título: " + getNome();
    }

    @Override
    public int compareTo(Titulo o) {
        return this.getNome().compareTo(o.getNome());
    }

    public static void main(String[] args) {
        Titulo titulo1 = new Titulo("A volta dos que não foram");
        var titulo2 = new Titulo("Poeira em alto mar");
        var titulo3 = new Titulo("Louco por ti América");
        var titulo4 = new Titulo("Bumba meu boi");

        List<Titulo> listaDeTitulos = new ArrayList<>();
        listaDeTitulos.add(titulo1);
        listaDeTitulos.add(titulo2);
        listaDeTitulos.add(titulo3);
        listaDeTitulos.add(titulo4);
        System.out.println(listaDeTitulos);

        List<String> listaLinkedList = new LinkedList<>();
        listaLinkedList.add("Elemento A");
        listaLinkedList.add("Elemento B");
        System.out.println(listaLinkedList);

        Collections.sort(listaDeTitulos);
        System.out.println("Lista ordenada");
        System.out.println(listaDeTitulos);

        List<String> listaPolimorfica;

        listaPolimorfica = new ArrayList<>();
        listaPolimorfica.add("Elemento 1");
        listaPolimorfica.add("Elemento 2");
        System.out.println("ArrayList: " + listaPolimorfica);

        listaPolimorfica = new LinkedList<>();
        listaPolimorfica.add("Elemento A");
        listaPolimorfica.add("Elemento B");
        System.out.println("LinkedList: " + listaPolimorfica);
    }
}
