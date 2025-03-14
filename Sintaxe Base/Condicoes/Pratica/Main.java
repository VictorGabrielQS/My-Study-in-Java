package Condicoes.Pratica;

public class Main {
    public static void main(String[] args) {

        int nota = 900;

        if (nota >= 90 && nota <= 100){
            System.out.println("Nota A");

        } else if (nota >= 80 && nota <= 89 ) {
            System.out.println("Nota B");

        } else if (nota >= 70 && nota <= 79) {
            System.out.println("Nota C");

        } else if (nota >= 60 && nota <= 69) {
            System.out.println("Nota D");

        }else {
            System.out.println("Nota F");
        }


    }
}
