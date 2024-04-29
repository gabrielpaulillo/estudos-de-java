package br.com.alura.exercicios6;

import java.util.ArrayList;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public static void main(String[] args) {
        double soma = 0;
        double media = 0;
        Produto amaciante = new Produto("Amaciante", 18.90);
        Produto candida = new Produto("Água Sanitária", 7.90);
        Produto papelHigienico = new Produto("Papel higiênico", 14.90);
        Produto detergente = new Produto("Detergente", 3.90);

        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(amaciante);
        produtos.add(candida);
        produtos.add(papelHigienico);
        produtos.add(detergente);

        for (Produto produto : produtos) {
            soma += produto.getPreco();
        }

        media = soma / produtos.size();

        System.out.println("Soma do preço dos produtos: " + soma +
                           ", \nMédia dos preços: " + media);
    }
}
