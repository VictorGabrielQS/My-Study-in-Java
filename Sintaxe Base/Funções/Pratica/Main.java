package Funções.Pratica;

public class Main {

    public static int NumeroMaior(int n1 , int n2){

        int numeroMaior;

        if ( n1 <= n2){

            System.out.println("O Segundo numero e maior que o Primeiro.");
            numeroMaior = n2;
        }else {
            System.out.println("O Primeiro numero e maior que o Segundo.");
            numeroMaior = n1;
        }

        return numeroMaior;
    }


    public static void main(String[] args) {
         int resultado = NumeroMaior(50 , 200);
         System.out.println(resultado);

    }

}
