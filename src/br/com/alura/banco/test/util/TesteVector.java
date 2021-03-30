package br.com.alura.banco.test.util;

import br.com.alura.banco.modelo.Conta;
import br.com.alura.banco.modelo.ContaCorrente;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

/**
 * Vector tbm eh uma implementacao de List.
 * Vector eh thread safe. Ele eh a implementacao que pode ser manipulada por varias threads aqui no Java
 * */
public class TesteVector {
    public static void main(String[] args) {

        Conta cc1 = new ContaCorrente(106,54871);
        Conta cc2 = new ContaCorrente(106,54871);

        List<Conta> contas = new Vector<>(Arrays.asList(cc1, cc2));

        System.out.println("Tamanho da lista/vector: " + contas.size());
        System.out.println(contas);
    }
}
