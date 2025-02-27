package Pratica_Encapsulamento;

public class Main {
    public static void main(String[] args) {

        ContaBancaria contaBancaria1 = new ContaBancaria();

        contaBancaria1.cadastrarTitular("Maria" , 500.00);

        contaBancaria1.depositar(300);

        contaBancaria1.sacar(200.00);

        System.out.println(contaBancaria1.exibirSaldo());


    }
}
