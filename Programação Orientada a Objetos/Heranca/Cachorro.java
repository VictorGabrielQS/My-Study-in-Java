package Heranca;

public class Cachorro extends Animal{

    public Cachorro(String nome) {
        super(nome);

    }

    void latir(){
        System.out.println(nome + " está latindo ");
    }

}
