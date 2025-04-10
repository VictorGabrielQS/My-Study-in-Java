package Exceções.Pratica;

public class Main {

    public static double calcular(int n1, int n2){
        double resultado = n1 / n2;
        return resultado;
    };


    public static void main(String[] args) {
        try {

            System.out.println(calcular(5 , 5));

        } catch (ArithmeticException e) {
            System.out.println("Erro zero não e dividido por um numero");
        }

    }
}
