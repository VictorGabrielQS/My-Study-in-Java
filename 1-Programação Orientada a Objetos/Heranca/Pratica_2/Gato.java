package Heranca.Pratica_2;

public class Gato extends Animal{

    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    void movimentar() {
        System.out.println("O gato está pulando");
    }

}
