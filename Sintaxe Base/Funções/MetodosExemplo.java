package Funções;

public class MetodosExemplo {

/*  Em Java, funções são chamadas de métodos.
    Eles são blocos de código que podem ser reutilizados
    e são definidos dentro de classes. Métodos podem receber
    parâmetros e retornar valores.  */

    //Metodo sem retorno ( void )

    public static void Saudacao(String nome){
        System.out.println("Ola " + nome + " Bem vindo.");

    }

    public static void main(String[] args) {
        Saudacao("Victor");
    }

}
