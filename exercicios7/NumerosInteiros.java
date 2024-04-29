package br.com.alura.exercicios7;

public class NumerosInteiros {
    private int numero;

    public NumerosInteiros(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return String.valueOf(this.getNumero());
    }

    public int getNumero() {
        return numero;
    }
}
