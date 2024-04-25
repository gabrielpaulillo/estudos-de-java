package br.com.alura.exercicios3;

public class Servico implements Vendavel {
    double preco;
    @Override
    public double calcularPrecoTotal(double quantidade) {
        return this.preco * quantidade;
    }

    @Override
    public double aplicarDescontos(double quantidade) {
        if (quantidade >= 2) {
            System.out.println("Você necessita de " + quantidade + " serviços. Portanto você ganhará 10% de desconto!");
            return preco * quantidade * 0.9;
        } else {
            System.out.println("Para receber algum desconto, solicite mais de nossos serviços!");
            System.out.println("Portanto, o valor permanecerá inteiro.");
            return preco * quantidade;
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
