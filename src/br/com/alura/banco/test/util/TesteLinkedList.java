package br.com.alura.banco.test.util;

import java.util.LinkedList;

public class TesteLinkedList {
    public static void main(String[] args) {

        /**
         * Uma LinkedList eh uma lista bidirecional. Os elementos sao guardados na ordem de insercao, mas nao como um
         * Array. Sao elementos que tem referencia(ponteiros) para o proximo elemento e o anterior, com excecao o
         * ultimo e o primeiro elemento.
         * Assim como ArrayList, LinkedList tbm implementa a interface List.
         * */
        LinkedList<String> nomes = new LinkedList<>();
        // List<String> nomes = new LinkedList<>(); declaracao equivalente acima
        nomes.add("Mary");
        nomes.add("John");
        nomes.add("Levi");


        System.out.println("Acesso por posicao: " + nomes.get(1));

        for (var nome : nomes) {
            System.out.println(nome);
        }
    }
}
