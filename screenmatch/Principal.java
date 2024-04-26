package br.com.alura.screenmatch;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão",1972);
//        meuFilme.setNome("O poderoso chefão");
//        meuFilme.setAnoDeLancamento(1972);
        meuFilme.setDuracaoEmMinutos(175);

        System.out.println("Ano de lançamento: " + meuFilme.getAnoDeLancamento());
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos() + "\n");

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(10);
        meuFilme.avalia(8);
        meuFilme.avalia(6);
        meuFilme.avalia(3);

        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("Média das avaliações: " + meuFilme.pegaMedia() + "\n");

        Serie lost = new Serie("Lost", 2000);
//        lost.setNome("Lost");
//        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(6);
        lost.setEpisodioPorTemporada(16);
        lost.setMinutosPorEpisodio(50);

        System.out.println("Tempo para maratonar a série: " + lost.getDuracaoEmMinutos() + " minutos.\n");

        Filme outroFilme = new Filme("Avatar", 2023);
//        outroFilme.setNome("Avatar");
//        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);

        System.out.println("Tempo total: " + calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtrar(meuFilme);

        Episodio primeiro = new Episodio();
        primeiro.setNumero(1);
        primeiro.setSerie(lost);
        primeiro.setTotalVisualizacoes(2);
        filtro.filtrar(primeiro);

        var filmeDoLouie = new Filme("Dogville", 2003);
//        filmeDoLouie.setNome("Dogville");
        filmeDoLouie.setDuracaoEmMinutos(200);
//        filmeDoLouie.setAnoDeLancamento(2003);
        filmeDoLouie.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoLouie);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("Tamanho do vetor: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
        System.out.println("Vetor dos filmes: " + listaDeFilmes);
        System.out.println("toString do filme: " + listaDeFilmes.get(0).toString());



    }
}