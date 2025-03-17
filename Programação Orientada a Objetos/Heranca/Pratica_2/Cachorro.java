package Heranca.Pratica_2;

public class Cachorro extends Animal{

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    void movimentar() {
        System.out.println("O cachorro está correndo");
    }

}
