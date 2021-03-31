package br.com.alura.banco.test.util;

import br.com.alura.banco.modelo.Conta;
import br.com.alura.banco.modelo.ContaCorrente;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TesteSort {
    public static void main(String[] args) {

        Conta cc1 = new ContaCorrente(106, 78921);
        cc1.deposita(456.0);
        Conta cc2 = new ContaCorrente(107, 78922);
        cc2.deposita(265.0);
        Conta cc3 = new ContaCorrente(108, 78923);
        cc3.deposita(700.0);
        Conta cc4 = new ContaCorrente(109, 78924);
        cc4.deposita(1500.5);

        List<Conta> contas = new ArrayList<>(Arrays.asList(cc1, cc2, cc3, cc4));
        contas.sort(Comparator.comparingDouble(Conta::getSaldo));

        contas.forEach(System.out::println);
    }
}
