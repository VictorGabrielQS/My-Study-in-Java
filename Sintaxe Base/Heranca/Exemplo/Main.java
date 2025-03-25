package Heranca.Exemplo;

public class Main {
    public static void main(String[] args) {
        // Criando um objeto da classe Carro
        Carro meuCarro = new Carro("Honda" , "Civic" , 2024  , 4);
        meuCarro.exibirInformacoes();
        meuCarro.acelerar(70);
        meuCarro.abrirPorta();

        System.out.println(); // Linha em branco para separar

        // Criando um objeto da classe Moto
        Moto minhaMoto = new Moto("Honda", "CB 500", 2021, true);
        minhaMoto.exibirInformacoes();
        minhaMoto.acelerar(100);
        minhaMoto.empinar();
    }
}