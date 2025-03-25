package Sobrecarga.Sobrecarga_Construtores;

public class Pessoa {
    private String nome;
    private  int idade;

    //Construtor Padrão
    public Pessoa(){
        this.nome = "Sem nome";
        this.idade = 0;
    }

    // Sobrecarga: construtor com nome
    public Pessoa(String nome){
        this.nome = nome ;
        this.idade = 0;
    }

    // Sobrecarga: construtor com nome e idade
    public Pessoa(String nome , int idade){
        this.nome = nome;
        this.idade = idade;
    }



    // Métodos Gets
    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }



}
