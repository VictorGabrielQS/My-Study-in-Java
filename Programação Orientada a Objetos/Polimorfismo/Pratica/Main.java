package Polimorfismo.Pratica;

public class Main {
    public static void main(String[] args) {

        InstrumentoMusical instrumento1 = new Violao();
        instrumento1.tocar();


        InstrumentoMusical instrumento2 = new Piano();
        instrumento2.tocar();


    }
}
