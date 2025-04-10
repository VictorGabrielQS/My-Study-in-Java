package Exceções;

/*
                              - throw -

Você pode lançar uma exceção manualmente usando a palavra-chave throw.
Isso é útil quando você quer indicar que ocorreu um erro em seu código.

*/

public class Throw {
    public static void main(String[] args) {
        try {
            validarIdade(15); // Lança uma exceção

        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    static  void validarIdade(int idade){
    if (idade < 18){
        throw new IllegalArgumentException("Idade inválida! Você deve ter pelo menos 18 anos.");
    }
        System.out.println("Idade Valida");
    }
}
