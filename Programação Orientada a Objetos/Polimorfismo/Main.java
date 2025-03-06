package Polimorfismo;

public class Main {
    public static void main(String[] args) {
        Animal meuAnimal = new Cachorro();
        meuAnimal.fazerSom();

        Animal meuAnimal2 = new Gato();
        meuAnimal2.fazerSom();

        Animal meuAnimal3 = new Passaro();
        meuAnimal3.fazerSom();

    }
}
