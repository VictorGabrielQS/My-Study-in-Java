package Encapsulamento;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();

        //Nome :

        System.out.println(pessoa1.getNome());

        pessoa1.setNome("Victor");

        System.out.println(pessoa1.getNome());


        //Idade :

        System.out.println(pessoa1.getIdade());

        pessoa1.setIdade(20);

        System.out.println(pessoa1.getIdade());


    }
}
