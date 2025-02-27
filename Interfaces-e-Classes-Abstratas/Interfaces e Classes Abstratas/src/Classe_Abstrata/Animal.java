package Classe_Abstrata;

abstract class Animal {
     String nome;

     //Construtor
     public Animal(String nome){

         this.nome = nome;
     }

    // Método abstrato (deve ser implementado pelas subclasses)
    abstract void emitirSom();

    // Método normal (pode ser herdado sem necessidade de implementação)
    void dormir() {

        System.out.println(nome + " está dormindo.");
    }


}
