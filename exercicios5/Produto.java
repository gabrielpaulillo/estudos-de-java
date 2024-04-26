package br.com.alura.exercicios5;

import java.util.ArrayList;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto (String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();

        var produto1 = new Produto("Banana", 5.30, 1);
        var produto2 = new Produto("Maçã", 8.60, 7);
        var produto3 = new Produto("Laranja", 7.20, 14);
        var produto4 = new Produto("Ovos", 15.00, 30);
        var produto5 = new Produto("Tapioca", 12.10, 1);

        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);
        produtos.add(produto5);

        System.out.println("Tamanho da lista: " + produtos.size());
        System.out.println("Terceiro item: " + produtos.get(2).getNome());

        for (Produto produto : produtos) {
            System.out.println(produto);
        }

    }

    @Override
    public String toString() {
        return  "nome = " + nome + '\'' +
                ", preco = " + preco +
                ", quantidade = " + quantidade +
                "\n";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
