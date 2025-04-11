package Streams_API_filter_map_reduce;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

record Produto(
        String nome,
        double preco,
        String categoria,
        int estoque) {

}

public class Pratica {

    public static void main(String[] args) {
        List<Produto> produtos = List.of(
                new Produto("Notebook", 3500.0, "Eletrônicos", 10),
                new Produto("Camiseta", 49.9, "Roupas", 20),
                new Produto("Smartphone", 1999.9, "Eletrônicos", 15),
                new Produto("Arroz", 22.5, "Alimentos", 50),
                new Produto("Calça Jeans", 120.0, "Roupas", 8),
                new Produto("Leite", 4.5, "Alimentos", 100)
        );


       /*  

       1. Filtragem e Listagem
       Objetivo: Obter uma lista de produtos com estoque menor que 15. 
       
       */

        List<Produto> filtragemBaixa = produtos.stream()
                .filter(p -> p.estoque() < 15)
                .toList();

        System.out.println("Lista de produtos com estoque menor que 15 : " + filtragemBaixa);


        /* 

        2. Mapeamento e Transformação
        Objetivo: Criar uma lista dos nomes dos produtos da categoria "Eletrônicos".

        */

        List<String> nomesEletronicos = produtos.stream()
            .filter(p -> p.categoria().equals("Eletrônicos")) // Filtra todos os objetos Produtos que possui categoria igual a Eletrônicos
            .map(Produto::nome)
            .toList();

            System.out.println("Produtos com categoria Eletronicos :" + nomesEletronicos );


        /* 

        3. Redução (Cálculo de Valor Total)
        Objetivo: Calcular o valor total em estoque (preço × quantidade) de todos os produtos.
        
        */

        double valorTotal = produtos.stream()
            .mapToDouble(p -> p.preco() * p.estoque())
            .sum();
        System.out.println("Valor total em estoque : " + valorTotal);



        /* 
        
        4. Agrupamento (Grouping By)
        Objetivo: Agrupar produtos por categoria.
        
        */

        Map<String , List<Produto>> porCategoria = produtos.stream()
            .collect(Collectors.groupingBy(Produto::categoria));
            System.out.println(porCategoria);




/*         5. Encontrar o Produto Mais Caro
        Objetivo: Encontrar o produto com o maior preço. */


        List<Produto> maiorValor =  produtos.stream()
        .sorted(Comparator.comparingDouble(Produto::preco).reversed())
        .toList();
        System.out.println("Preco mais alto : " + maiorValor.get(0));
        

    }
}
