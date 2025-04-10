package Lista;

import java.util.ArrayList;

public class ListaManipulacao {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);

        // Removendo o elemento da posição 1 (valor 20)
        Integer numeroRemovido =  numeros.remove(1);

        System.out.println("Numero Removido : " + numeroRemovido);
        System.out.println("Lista Atualizada : "+ numeros );

    }

}
