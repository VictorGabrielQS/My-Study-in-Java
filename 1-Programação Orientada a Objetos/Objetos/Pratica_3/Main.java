package Objetos.Pratica_3;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Victor", 20);
        pessoa1.setIdade(21);
        pessoa1.dadosPessoa();

        Pessoa pessoa2 = new Pessoa("Thalita" , 19);
        pessoa2.setIdade(20);
        pessoa2.dadosPessoa();

    }
}
