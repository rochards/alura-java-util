package br.com.alura.banco.modelo;

public abstract class Conta {

    protected int agencia;
    protected int numero;

    public Conta(int agencia, int numero) {
        this.agencia = agencia;
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "agencia=" + agencia +
                ", numero=" + numero +
                '}';
    }
}
