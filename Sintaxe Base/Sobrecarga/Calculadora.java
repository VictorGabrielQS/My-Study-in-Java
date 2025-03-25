package Sobrecarga;

public class Calculadora {

    //Soma dois inteiros
    public int somar(int a , int b){
        return a + b;
    }

    // Sobrecarga: soma três inteiros
    public int somar(int a , int b , int c){
        return  a + b + c;
    }


    // Sobrecarga: soma dois doubles
    public double somar(double a , double b){
        return a + b;
    }


    // Sobrecarga: soma um int e um double
    public double somar(int a , double b) {
        return  a + b;
    }


    // Sobrecarga: soma um double e um int (ordem diferente)
    public double somar(double a , int b){
        return a + b;
    }

}
