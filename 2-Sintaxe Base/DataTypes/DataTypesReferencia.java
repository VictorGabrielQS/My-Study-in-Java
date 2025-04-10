package DataTypes;

import java.util.ArrayList;
import java.util.List;

public class DataTypesReferencia {

    public static void main(String[] args) {

        //Classes :

        String nome = "Gabriel";
        String str = "123";
        int valor = Integer.parseInt(str); // Converte String para int
        Integer numero = Integer.valueOf(str); // Converte String para Integer


        //Arrays :

        int[] numeros = {1,2,3,4,5};
        String[] nomes = { "João" , "Lucas" , "Pedro" , "Maria" };


        //Interfaces :

        List<String> lista = new ArrayList<>();
        lista.add("Victor");
        lista.add("Thalita");
        lista.add("Fabricio");
        lista.remove("Victor"); // ou indixe : 0



        // Saidas:

        //Clases saida:
        System.out.println("String : " + nome);
        System.out.println("Integer : " + numero);


        //Arrays saida:
        System.out.println("Numeros : ");
        for ( int num : numeros){
            System.out.println(num + " ");

        }

        System.out.println("Nomes : ");
        for ( String nom : nomes ){
            System.out.println(nom);

        }



        //Interface saida:
        System.out.println("Interface : ");
        System.out.println(lista);

        for (String l : lista){
            System.out.println(l);
        }

    }
}
