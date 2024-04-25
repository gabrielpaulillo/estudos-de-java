package br.com.alura.exercicios1;

public class Aluno {
    private String nome;
    private double nota;
    private int notasInformadas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota += nota;
        notasInformadas++;
    }

    public double calcularMedia() {
        return this.nota / notasInformadas;
    }
}
