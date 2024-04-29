package br.com.alura.exercicios7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TesteNumerosInteiros {
    public static void main(String[] args) {
        NumerosInteiros num1 = new NumerosInteiros(82);
        var num2 = new NumerosInteiros(68);
        var num3 = new NumerosInteiros(54);
        var num4 = new NumerosInteiros(10);

        List<NumerosInteiros> listaDeNumerosInteiros = new ArrayList<>();

        listaDeNumerosInteiros.add(num1);
        listaDeNumerosInteiros.add(num2);
        listaDeNumerosInteiros.add(num3);
        listaDeNumerosInteiros.add(num4);
        System.out.println(listaDeNumerosInteiros);

        listaDeNumerosInteiros.sort(Comparator.comparing(NumerosInteiros::getNumero));
        System.out.println("Lista ordenada");
        System.out.println(listaDeNumerosInteiros);
    }
}
