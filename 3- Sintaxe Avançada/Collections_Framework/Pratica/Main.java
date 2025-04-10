package Collections_Framework.Pratica;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Fila atendimento - FIFO
        Queue<String> filaAtendimento = new LinkedList<>();
        filaAtendimento.offer("Paulo");
        filaAtendimento.offer("Fernanda");

        System.out.println("Próximo : " + filaAtendimento.poll()); // Cliente 1

        // Conjunto de produtos únicos
        Set<String> produtos = new HashSet<>();
        produtos.add("Mouse");
        produtos.add("Notebook");
        produtos.add("Monitor");
        produtos.add("Notebook"); // Ignorado

        System.out.println("Produtos : " + produtos);

        // Pilha de documentos - LIFO
        Deque<String> pilhaDocumentos = new ArrayDeque<>();
        pilhaDocumentos.push("Doc1");
        pilhaDocumentos.push("Doc2");

        System.out.println("Último documento : " + pilhaDocumentos.pop()); // Doc2


        //Desafios com Set (HashSet, LinkedHashSet, TreeSet) - Crie um programa que receba
        // uma lista de nomes com duplicatas e retorne os nomes únicos em:

        String[] nomes = {"Ana", "João", "Carlos", "Ana", "Carlos", "Bruna"};

        // ✅ 1. Remover Duplicatas

        // - hashSet
        Set<String> hashSet = new HashSet<>();
        for ( String nome : nomes){
            hashSet.add(nome);
        }

        System.out.println("Lista nomes HashSet : " + hashSet);

        // - LinkedHaSet
       Set<String> linkedHashSet = new LinkedHashSet<>();
       for (String nome : nomes){
           linkedHashSet.add(nome);
       }

        System.out.println("Lista nomes LinkedHashSet : " + linkedHashSet);

        // - TreeSet
        Set<String> treeSet = new TreeSet<>();
        for (String nome : nomes){
          treeSet.add(nome);
        }

        System.out.println("Lista nomes TreeSet : " + treeSet);



        // ✅ 2. Interseção e Diferença de Conjuntos
        // Dado dois conjuntos de números inteiros:

        int[] numeros_A = {1 ,2 ,3 , 4 ,5 , 6 ,7  };
        int[] numeros_B = {1 ,2 ,3 };

        Set<Integer>  conjuntoA = new HashSet<>();
       for (int n : numeros_A){
           conjuntoA.add(n);
       }

       Set<Integer> conjuntoB = new HashSet<>();
       for (int n : numeros_B){
           conjuntoB.add(n);
       }


       Set<Integer> intersecao = new HashSet<>(conjuntoA);

       intersecao.retainAll(conjuntoB);

        System.out.println("Interseção (A ∩ B):" + intersecao);

        Set<Integer> diferenca = new HashSet<>(conjuntoA);

        diferenca.removeAll(conjuntoB);

        System.out.println("Os numeros diferente de A para B são : " + diferenca );



        // Diferença entre nomes

        String[] nomesA = {"Victor" ,  "Gabriel" , "Thalita" , "Laura"};
        String[] nomesB = {"Thalita" , "Laura"};

        Set<String> conjuntoNomesA = new HashSet<>();
        Set<String> conjuntoNomesB = new HashSet<>();

        for (String nome : nomesA){
            conjuntoNomesA.add(nome);
        }

        for (String nome : nomesB){
            conjuntoNomesB.add(nome);
        }


        Set<String> diferencaNomes = new HashSet<>(conjuntoNomesA);
        diferencaNomes.removeAll(conjuntoNomesB);

        System.out.println(diferencaNomes);















    }
}
