package br.com.alura.banco.modelo;

public class GuardadorDeContas {

    private int posicao;
    private Conta[] contas;

    public GuardadorDeContas() {
        this.contas = new Conta[10];
    }

    public void adiciona(Conta conta) {
        this.contas[posicao] = conta;
        this.posicao++;
    }

    public int size() {
        return posicao;
    }

    public Conta get(int posicao) {
        return contas[posicao];
    }
}
