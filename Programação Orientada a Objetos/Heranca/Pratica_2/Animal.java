package Heranca.Pratica_2;

public class Animal {
    String nome;
    int idade;

    public Animal(String nome , int idade){
        this.nome = nome;
        this.idade = idade;
    }

    void movimentar(){
        System.out.println(nome + " esta se movimentando ...");
    }
}
