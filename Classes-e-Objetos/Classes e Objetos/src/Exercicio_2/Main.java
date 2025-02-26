package Exercicio_2;

public class Main {
    public static void main(String[] args) {

        ContaBancaria contaBancaria1 = new ContaBancaria("Victor Gabriel Quintino Souza Santos" , "71392338107" , 100.00 );

        contaBancaria1.setSaldo(20);

        System.out.println(contaBancaria1.getSaldo());

        contaBancaria1.removeSaldo(100);

    }
}
