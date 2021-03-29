package br.com.alura.banco.test;

import br.com.alura.banco.modelo.Conta;
import br.com.alura.banco.modelo.ContaCorrente;
import br.com.alura.banco.modelo.GuardadorDeContas;

public class TesteGuardadorDeContas {
    public static void main(String[] args) {

        GuardadorDeContas guardador = new GuardadorDeContas();

        Conta cc1 = new ContaCorrente(106, 25697);
        Conta cc2 = new ContaCorrente(106, 26977);

        guardador.adiciona(cc1);
        guardador.adiciona(cc2);

        System.out.println("Quantidade de elementos: " + guardador.size());
        System.out.println("Conta na posicao 2: " + guardador.get(1));
    }
}
