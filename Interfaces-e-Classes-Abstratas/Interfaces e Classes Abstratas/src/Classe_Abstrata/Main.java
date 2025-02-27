package Classe_Abstrata;

public class Main {
    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro("Rex");
        cachorro1.emitirSom();
        cachorro1.dormir();

        Gato gato1 = new Gato("Mingau");
        gato1.emitirSom();
        gato1.dormir();

    }
}
