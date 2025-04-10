package Exceções;

/*
                      - Finally -

O bloco finally é opcional e é executado sempre, independentemente
de uma exceção ter sido lançada ou não.

*/

public class Finally {
    public static void main(String[] args) {

        try {
            int resultado = 10 / 0;
            System.out.println("Resultado : " + resultado);
        }catch (ArithmeticException e){
            System.out.println("Erro: Divisão por zero!");
        }finally {
            System.out.println("Bloco finally executado.");
        }

    }
}
