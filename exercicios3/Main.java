package br.com.alura.exercicios3;


public class Main {
    public static void main(String[] args) {
//        Exercício 1 - Conversor de Moeda
//        ConversorMoeda conversor = new ConversorMoeda();
//        conversor.converterDolarParaReal(1500);

//        Exercício 2 - Sala retangular
//        CalculadoraSalaRetangular sala = new CalculadoraSalaRetangular();
//        sala.calcularArea(3.1, 10.2);
//        sala.calcularPerimetro(3.1, 10.2);

//        Exercício 3 - Tabuada
//        TabuadaMultiplicacao tabuada = new TabuadaMultiplicacao();
//        tabuada.mostrarTabuada(6);

//        Exercício 4 - Conversor de Temperatura
//        ConversorTemperaturaPadrao conversor = new ConversorTemperaturaPadrao();
//        conversor.celsiusParaFahrenheit(17);
//        conversor.fahrenheitParaCelsius(92);

//        Exercício 5 - Calculável
//        Livro livro = new Livro();
//        System.out.println("Se o livro custar R$ 38,00, com o desconto ele sairá por R$ " + livro.calcularPrecoFinal(38));
//
//        ProdutoFisico produto = new ProdutoFisico();
//        System.out.println("Se o preço online estiver R$ 45,00 na loja física ele custará R$ " + produto.calcularPrecoFinal(45));

//        Exercício 6 - Vendável
//        Produto produto = new Produto();
//        produto.setPreco(13.6);
//        System.out.println("Preço total: " + produto.calcularPrecoTotal(10));
//        System.out.println("Desconto: " + produto.aplicarDescontos(10));
//        System.out.println("Preço com desconto: " + produto.aplicarDescontos(6));
//        System.out.println("Preço com desconto: " + produto.aplicarDescontos(3));

        Servico servico = new Servico();
        servico.setPreco(130.50);
        System.out.println("Preço total: R$ " + servico.calcularPrecoTotal(3));
        System.out.println("Preço com desconto: R$ " + servico.aplicarDescontos(3));
        System.out.println("Preço com desconto: R$ " + servico.aplicarDescontos(1));


    }
}
