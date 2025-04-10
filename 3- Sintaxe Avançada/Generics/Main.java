package Generics;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Classe Imprimir :

        Imprimir <String> conteudo1 = new Imprimir<>("Conteudo 1");
        System.out.println(conteudo1.exibirImprimir());

        Imprimir <Integer> conteudo2 = new Imprimir<>(10);
        System.out.println(conteudo2.exibirImprimir());


        //Classe Caixa

        Caixa <String> caixa1 = new Caixa<>();
        caixa1.adicionar("Brinquedo");
        System.out.println(caixa1.obter());

        Caixa <Integer> caixa2 = new Caixa<>();
        caixa2.adicionar(10);
        System.out.println(caixa2.obter());


        //Listas Genericos

        Lista<String> lista1 = new Lista<>();
        lista1.adicionarLista("Elemento 1");
        System.out.println(lista1.exibirLista());
        lista1.adicionarLista("Elemento 2");
        lista1.removerItemLista("Elemento 1");
        System.out.println(lista1.exibirLista());

        Lista<Integer> lista2 = new Lista<>();
        lista2.adicionarLista(1);
        lista2.adicionarLista(10);
        System.out.println(lista2.exibirLista());



        //Metodos Genericos

        Util.imprimir("Texto genérico");
        Util.imprimir(123);
        Util.imprimir(3.14);


        // Uso de ? (Wildcard) em Generics

        List<Integer> numeros = List.of(1,2,3);
        List<String> textos = List.of("A", "B" , "C" );

        Impressora.imprimirLista(numeros);
        Impressora.imprimirLista(textos);


    }
}
