package br.com.alura.exercicios6;

public class Animal {
    private int patas;
    private String nome;

    public Animal(int patas, String nome) {
        this.patas = patas;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Nome do animal: " + getNome() + ", " +
               "Patas: " + getPatas();
    }

    public void emitirSom() {
        System.out.println("Está emitindo som!");
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
