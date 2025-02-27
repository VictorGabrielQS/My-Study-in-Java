package Classe_Abstrata;

public class Cachorro extends Animal {

    public Cachorro(String nome){
        super(nome);
    }

    @Override
    void emitirSom() {

        System.out.println(nome + " está latindo.");
    }

}
