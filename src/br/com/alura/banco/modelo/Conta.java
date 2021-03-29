package br.com.alura.banco.modelo;

import java.util.Objects;

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
                '}';
    }
}
