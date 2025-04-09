package Streams_API_filter_map_reduce;

/*

📌 Cenário: Sistema de Gestão de Produtos

Você tem uma lista de produtos vendidos em uma loja online. Cada produto possui:

    Nome

    Preço

    Categoria (Eletrônicos, Roupas, Alimentos)

    Quantidade em estoque

    Seu objetivo é processar esses dados usando Streams para extrair informações úteis.

*/


import java.util.List;


record Produto(
        String nome,
        double preco,
        String categoria,
        int estoque) {}


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

        //Filtragem e Listagem


        // Seu código aqui!
    }

}
