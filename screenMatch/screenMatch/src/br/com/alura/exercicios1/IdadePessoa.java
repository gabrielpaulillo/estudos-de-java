package br.com.alura.exercicios1;

public class IdadePessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void verificarIdade() {
        if (idade >= 18) {
            System.out.println(nome + " você é maior de idade! Pode aprender a dirigir.");
        } else {
            System.out.println(nome + " você é menor de idade! Espere completar 18 anos.");
        }
    }
}
