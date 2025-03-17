package Objetos.Pratica_3;

public class Pessoa {
    String nome;
    private int idade;

    public Pessoa(String nome , int idade){
        this.nome = nome;
        this.idade = idade;

    }

    public void setIdade(int idadeAgora){
        if (idadeAgora > idade){
            this.idade = idadeAgora;
        }
        else {
            System.out.println("A idade e menor não e possível adicionar a idade...");
        }
    }

    public void dadosPessoa(){
        System.out.println("Nome : " + nome);
        System.out.println("Idade : " + idade );
    }

}
