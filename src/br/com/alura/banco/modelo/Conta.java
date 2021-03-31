package br.com.alura.banco.modelo;

import java.util.Objects;

public abstract class Conta {

    protected int agencia;
    protected int numero;
    protected double saldo;

    public Conta(int agencia, int numero) {
        this.agencia = agencia;
        this.numero = numero;
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Conta)) return false;
        Conta conta = (Conta) o;
        return agencia == conta.agencia && numero == conta.numero;
    }

    @Override
    public int hashCode() {
        return Objects.hash(agencia, numero);
    }

    @Override
    public String toString() {
        return "Conta{" +
                "agencia=" + agencia +
                ", numero=" + numero +
                ", saldo=" + saldo +
                '}';
    }
}
