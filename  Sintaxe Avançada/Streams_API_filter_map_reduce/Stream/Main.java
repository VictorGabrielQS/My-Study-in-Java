package Streams_API_filter_map_reduce.Stream;

import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<String> nomes = List.of("Ana", "João", "Maria", "Pedro");

        Stream<String> stream = nomes.stream();

        System.out.println(stream);

    }
}
