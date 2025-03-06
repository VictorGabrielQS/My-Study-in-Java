package Objetos;

public class Animal {
    String nome;
    int idade;

    void emitirSom(){
        System.out.println(nome + " está emitindo um som. ");
    }

    public static void main(String[] args) {

        Animal cachorro = new Animal();
        cachorro.nome = "Rex";
        cachorro.idade = 5;
        cachorro.emitirSom();


        Animal gato = new Animal();
        gato.nome = "Mia";
        gato.idade = 3;
        gato.emitirSom();


    }
}

