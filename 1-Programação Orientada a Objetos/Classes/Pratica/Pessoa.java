package Classes.Pratica;

public class Pessoa {
    String nome;
    int idade;
    double altura;

    public Pessoa (String nome , int idade , double altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    void exibirInformacoes(){
        System.out.println("Nome : " + nome);
        System.out.println("Idade : " + idade);
        System.out.println("Altura : " + altura);

    }

    public static void main(String[] args) {


        Pessoa pessoa = new Pessoa("João" , 20 , 1.75);
        pessoa.exibirInformacoes();


        Pessoa pessoa2 = new Pessoa("Maria" , 22 , 1.73);
        pessoa2.exibirInformacoes();


    }

}
