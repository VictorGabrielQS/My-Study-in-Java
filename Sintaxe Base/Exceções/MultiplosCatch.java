package Exceções;


/*

                      - Múltiplos blocos catch -

     Posso capturar diferentes tipos de exceções usando múltiplos blocos catch.

*/

public class MultiplosCatch {
    public static void main(String[] args) {
        try {
            int[] numeros = {1,2,3};
            System.out.println(numeros[5]); // Isso lançará uma ArrayIndexOutOfBoundsException

        }catch (ArithmeticException e){
            System.out.println("Erro aritmético!");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Erro: Índice fora dos limites do Array!");

        }finally {
            System.out.println("Bloco finally executado.");
        }

    }
}
