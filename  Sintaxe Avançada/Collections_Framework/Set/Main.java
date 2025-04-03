package Collections_Framework.Set;

//Set - Essa estrutura de dados e Não ordenada (a menos que use LinkedHashSet ou TreeSet), e não permite duplicidade.

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        //HashSet - Não ordenado, O(1) para inserção/busca
        Set<String> frutas = new HashSet<>();
        frutas.add("Banana");
        frutas.add("Maçã");
        frutas.add("Laranja");
        frutas.add("Maçã"); // Duplicado ignorado

        System.out.println("HashSet: " + frutas);

        for (String f : frutas){
            System.out.println(f);
        }

        //LinkedHashSet - Mantém a ordem de inserção

        Set<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("Banana");
        linkedHashSet.add("Maçã");
        linkedHashSet.add("Laranja");
        linkedHashSet.add("Maçã"); // Duplicado, será ignorado

        System.out.println("LinkedHashSet : " + linkedHashSet);

        for (String l : linkedHashSet){
            System.out.println(l);

        }

        // TreeSet (Ordenado naturalmente)

        Set<String> treeSet = new TreeSet<>();

        treeSet.add("Banana");
        treeSet.add("Maçã");
        treeSet.add("Laranja");
        treeSet.add("Maçã"); // Duplicado, será ignorado

        System.out.println("TreeSet: " + treeSet);

        for (String t : treeSet){
            System.out.println(t);
        }

    }
}
