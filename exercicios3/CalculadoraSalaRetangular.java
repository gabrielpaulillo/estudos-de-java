package br.com.alura.exercicios3;

public class CalculadoraSalaRetangular implements CalculoGeometrico {
    @Override
    public void calcularArea(double altura, double largura) {
        double area = altura * largura;
        System.out.println("Área da sala retangular: " + area + " m²");
    }

    @Override
    public void calcularPerimetro(double altura, double largura) {
        double perimetro = 2 * (altura + largura);
        System.out.println("Perímetro da sala retangular: " + perimetro + " m");
    }
}
