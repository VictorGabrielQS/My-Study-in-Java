package Sobrecarga.Sobrecarga_Construtores;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa("João");
        Pessoa pessoa3 = new Pessoa("Maria" , 30);


        System.out.println(pessoa1.getNome() + " - " + pessoa1.getIdade()); // Sem nome - 0

        System.out.println(pessoa2.getNome() + " - " + pessoa2.getIdade()); // João - 0

        System.out.println(pessoa3.getNome() + " - " + pessoa3.getIdade()); // Maria - 30

    }
}
