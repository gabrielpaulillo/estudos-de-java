package br.com.alura.exercicios4;

public class Pessoa {
    private String nome;
    private int idade;

//    Aqui foi criado um construtor da classe pessoa, logo, quando
//    for instanciar um objeto da classe Pessoa, o construtor
//    exige que sejam inseridos o nome e a idade
    public Pessoa (String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa: " + this.nome + " (idade: " + this.idade + ")";
    }
}
