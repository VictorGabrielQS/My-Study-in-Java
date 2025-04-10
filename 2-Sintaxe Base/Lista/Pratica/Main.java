package Lista.Pratica;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> nomeCidades = new ArrayList<>();

        nomeCidades.add("Veneza");
        nomeCidades.add("Toronto");
        nomeCidades.add("Genebra");
        nomeCidades.add("Vancover");
        nomeCidades.add("Ottawa");

        System.out.println("Lista Antes : " + nomeCidades);

        //Remove o terceiro elemento da lista que esta no index 2
        nomeCidades.remove(2);

        System.out.println("Lista Depois : " + nomeCidades);

    }
}
