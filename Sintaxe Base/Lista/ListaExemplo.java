package Lista;

import java.util.ArrayList;

public class ListaExemplo {
    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Ana");
        nomes.add("Bruno");
        nomes.add("Fernando");
        nomes.add("Tiago");

        // Iterando com loop for-each
        for (String nome : nomes){
            System.out.println(nome);
        }


    }
}
