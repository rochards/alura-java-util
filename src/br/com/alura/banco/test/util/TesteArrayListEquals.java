package br.com.alura.banco.test.util;

import br.com.alura.banco.modelo.Conta;
import br.com.alura.banco.modelo.ContaCorrente;

import java.util.ArrayList;

public class TesteArrayListEquals {
    public static void main(String[] args) {

        // <E> -> generics
        ArrayList<Conta> contas = new ArrayList<>();

        Conta cc1 = new ContaCorrente(106, 25697);
        Conta cc2 = new ContaCorrente(106, 26977);

        contas.add(cc1);
        contas.add(cc2);

        Conta cc3 = new ContaCorrente(106, 26977);

        // como implementamos um metodo equals em Conta, por baixo dos panos o contais o utiliza para fazer comparacao
        boolean existe = contas.contains(cc3);

        System.out.println("Há uma conta com agência 106 de número 26977? " + existe);
    }
}
