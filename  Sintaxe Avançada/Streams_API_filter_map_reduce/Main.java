package Streams_API_filter_map_reduce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {


        //Criado uma Lista -

        //Lista de String
        List<String> nomes = List.of("Ana", "João", "Maria", "Pedro" , "João");
        //Lista de Integer
        List<Integer> numeros = List.of(3 , 1 , 2 , 5 , 4 , 5);


        //Criando um Stream e fazendo ele receber os valores da lista recente criada
        Stream<String> stream = nomes.stream();

        //filter(Predicate<T>) - Filtra elementos com base em uma condição.

        //Exemplo: Filtra nomes que começam com "J"

        System.out.println(stream.filter(
                nome -> nome.startsWith("J"))
                .toList() // Lista o item encontrado que começa com a letra "J"
        );


        // map(Function<T, R>) - Transforma cada elemento em outro tipo.

        //Exemplo: Converter nomes para maiúsculas
        List<String> nomesMaisculos = nomes.stream()
                .map(String::toUpperCase)
                .toList();

        System.out.println(nomesMaisculos);


        //Exemplo: Converter nomes para minuscula.
        List<String> nomesMinusculos = nomes.stream()
                .map(String::toLowerCase)
                .toList();
        System.out.println(nomesMinusculos);


        //Exemplo: Extrair tamanho dos nomes
        List<Integer> tamanhos = nomes.stream()
                .map(String::length)
                .toList();
        System.out.println(tamanhos);


        //reduce(BinaryOperator<T>) - Combina todos os elementos em um único valor (soma, concatenação, etc).

        //Exemplo: Soma de números
        int soma = numeros.stream()
                .reduce(0,(a , b) -> a + b);
        System.out.println(soma);


        //Exemplo: Concatenar strings
        List<String> strings = List.of("Hello" ,  "Word !!");
        String concatenacao = strings.stream()
                .reduce("",(a , b) -> a +" "+ b)
                .trim();
        System.out.println(concatenacao);


        //Exemplo: Concatenar Arrays
        ArrayList<String> nomes1 = new ArrayList<>(Arrays.asList("Victor", "Ana", "Carlos", "Mariana"));
        ArrayList<String> nomes2 = new ArrayList<>(Arrays.asList("Rio de Janeiro", "São Paulo", "Belo Horizonte", "Curitiba"));

        List<String> concatenacao2 = Stream
                .concat(nomes1.stream() , nomes2.stream())
                .collect(Collectors.toList());
        System.out.println(concatenacao2);


        //sorted() - Ordena os elementos.


        //sorted - string
        List<String> ordenados = nomes.stream()
                .sorted()
                .toList();
        System.out.println(ordenados);


        //sorted- integer
        List<Integer> numerosOrdenados = numeros.stream()
                .sorted()
                .toList();

        System.out.println(numerosOrdenados);


        //distinct() - Remove duplicatas.

        //distinct - Integer
        List<Integer> numerosUnicos = numeros.stream()
                .distinct()
                .toList();
        System.out.println(numerosUnicos);


        //distinct - String
        List<String> nomesUnicos = nomes.stream()
                .distinct()
                .toList();

        System.out.println(nomesUnicos);


        //limit(n) e skip(n) - Limita ou pula elementos.
        List<String> primeiros = nomes.stream()
                .limit(2) // Ana, João
                .toList();
        System.out.println(primeiros);


        List<String> pular = nomes.stream()
                .skip(1)// pula "Ana"
                .toList();
        System.out.println(pular);



        //forEach(Consumer<T>) - Executa uma ação para cada elemento.

        nomes.stream()
                .forEach(System.out::println); // Imprime cada nome







    }
}
