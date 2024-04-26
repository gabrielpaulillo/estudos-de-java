package br.com.alura.exercicios5;

public class ProdutoPerecivel extends Produto {
    String dataValidade;

    public ProdutoPerecivel (String nome, double preco, int quantidade, String dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    public static void main(String[] args) {
        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Salmão", 80.90, 1, "2023-12-31");
        System.out.println(produtoPerecivel);
    }

    @Override
    public String toString() {
        return  "nome = " + getNome() +
                ", preco = " + getPreco() +
                ", quantidade = " + getQuantidade() +
                ", data de validade = " + this.dataValidade +
                "\n";
    }

}
