package br.com.alura.banco.test.util;

import br.com.alura.banco.modelo.Conta;
import br.com.alura.banco.modelo.ContaCorrente;

import java.util.ArrayList;

public class TesteArrayList {
    public static void main(String[] args) {

        ArrayList<Conta> contas = new ArrayList<>();

        Conta cc1 = new ContaCorrente(106, 25697);
        Conta cc2 = new ContaCorrente(106, 26977);

        contas.add(cc1);
        contas.add(cc2);

        System.out.println(contas);
        System.out.println("Tamanho da lista: " + contas.size());

    }
}
