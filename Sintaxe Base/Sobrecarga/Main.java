package Sobrecarga;

public class Main {
    public static void main(String[] args) {

        Calculadora calculadora1 = new Calculadora();

        System.out.println("Soma (int) : " + calculadora1.somar(10 , 10));
        System.out.println("Soma (int 3) : " + calculadora1.somar(10 , 10, 10));
        System.out.println("Soma (double , double) : " + calculadora1.somar(10.50 , 10.50));
        System.out.println("Soma (int , double) : " + calculadora1.somar(10 , 10.50));
        System.out.println("Soma (double , int) : " + calculadora1.somar(10.50 , 10));

    }
}
