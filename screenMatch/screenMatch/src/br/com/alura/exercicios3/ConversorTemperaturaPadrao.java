package br.com.alura.exercicios3;

public class ConversorTemperaturaPadrao implements ConversorDeTemperatura {
    @Override
    public void celsiusParaFahrenheit(double celsius) {
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println(celsius + "⁰C convertido para fahrenheit: " + fahrenheit + "⁰F");
    }

    @Override
    public void fahrenheitParaCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println(fahrenheit + "⁰F convertido para celsius: " + celsius + "⁰C");
    }
}
