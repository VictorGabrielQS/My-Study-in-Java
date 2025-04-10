package Generics;

import java.util.List;

public class Impressora {
    public static void imprimirLista(List<?> lista){
        for (Object item : lista){
            System.out.println(item);
        }

    }
}
