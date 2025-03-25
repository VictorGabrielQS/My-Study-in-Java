package Encapsulamento;

public class Main {

    public static void main(String[] args ){

        Carro carro1 = new Carro("Honda" , "Civic" , 2022 , false);

        carro1.login();

        carro1.setMarca("Ciena");

        carro1.exibirInformacoes();

        carro1.acelerar(70);

    }
}
