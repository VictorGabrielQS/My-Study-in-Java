package Polimorfismo.Pratica_2;

public class Main {
    public static void main(String[] args) {

        Forma circulo1 = new Circulo(5.0);
        System.out.println(circulo1.calcularArea());

        Forma retangulo1 = new Retangulo(10 , 10);
        System.out.println( retangulo1.calcularArea());

    }
}
