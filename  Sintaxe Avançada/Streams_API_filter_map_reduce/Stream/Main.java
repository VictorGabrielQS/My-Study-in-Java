package Streams_API_filter_map_reduce.Stream;

import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        //Criado uma Lista -
        List<String> nomes = List.of("Ana", "João", "Maria", "Pedro");

        //Criando um Stream e fazendo ele receber os valores da lista recente criada
        Stream<String> stream = nomes.stream();

        //filter(Predicate<T>) - Filtra elementos com base em uma condição.
        //Exemplo: Filtrar nomes que começam com "J"

        System.out.println(stream.filter(
                nome -> nome.startsWith("J"))
                .toList() // Lista o item encontrado que começa com a letra "J"
        );


        // map(Function<T, R>) -




    }
}
