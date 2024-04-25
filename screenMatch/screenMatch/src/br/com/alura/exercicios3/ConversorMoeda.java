package br.com.alura.exercicios3;

public class ConversorMoeda implements ConversaoFinanceira{
    @Override
    public void converterDolarParaReal(double valorDolar) {
        double cotacaoDoDolar = 4.91;
        double reais = valorDolar * cotacaoDoDolar;
        System.out.println("$" + valorDolar + " convertido para reais fica: R$" + reais);
    }
}
