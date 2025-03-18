package Exceções;

/*
                     - TryCatch -

O bloco try contém o código que pode lançar uma exceção.
O bloco catch captura e trata a exceção.

*/

public class TryCatch {
    public static void main(String[] args) {
        try {
            int resultado = 10 / 0; // Gera uma exceção ArithmeticException

            System.out.println("Resultado" + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro : Divisão por zero não e permitida");

        }
    }
}
