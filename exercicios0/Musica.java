package br.com.alura.exercicios0;

public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numAvaliacoes;

    void exibirFichaTecnica() {
        System.out.println("Título: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lançamento: " + anoLancamento);
    }

    void avaliarMusica(double nota) {
        avaliacao += nota;
        numAvaliacoes++;
    }

    double mediaDeAvaliacoes() {
        return avaliacao / numAvaliacoes;
    }
}
