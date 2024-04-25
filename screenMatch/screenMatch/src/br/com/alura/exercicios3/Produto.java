package br.com.alura.exercicios3;

public class Produto implements Vendavel {
    double preco;

    @Override
    public double calcularPrecoTotal(double quantidade) {
        double precoTotal = this.preco * quantidade;
        return precoTotal;
    }

    @Override
    public double aplicarDescontos(double quantidade) {
        double desconto;
        double precoComDesconto;
        if (quantidade > 10) {
            desconto = .90;
            precoComDesconto = this.preco * quantidade * desconto;
            return precoComDesconto;
        } else if (quantidade > 5) {
            desconto = .95;
            precoComDesconto = this.preco * quantidade * desconto;
            return precoComDesconto;
        } else {
            System.out.println("Só há desconto se comprar 5 unidades ou mais. Portanto o preço será inteiro: R$" + this.preco * quantidade);
            return this.preco * quantidade;
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
