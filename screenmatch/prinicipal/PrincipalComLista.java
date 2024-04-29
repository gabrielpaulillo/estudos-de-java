package br.com.alura.screenmatch.prinicipal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComLista {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1972);
        meuFilme.avalia(9);
        var outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);
        var filmeDoLouie = new Filme("Dogsville", 1960);
        filmeDoLouie.avalia(10);
        Serie lost = new Serie("Lost", 2000);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(filmeDoLouie);
        lista.add(lost);

        for (Titulo item: lista) {
            System.out.println("Nome: " + item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }

        }

        ArrayList<String> listaDeArtistas = new ArrayList<>();
        listaDeArtistas.add("Tom Hanks");
        listaDeArtistas.add("Adam Sandler");
        listaDeArtistas.add("Angelina Jolie");
        System.out.println(listaDeArtistas);

        Collections.sort(listaDeArtistas);
        System.out.println("Depois da ordenação: ");
        System.out.println(listaDeArtistas);
        System.out.println("Lista de títulos ordenados");
        Collections.sort(lista);
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano");
        System.out.println(lista);
    }
}
