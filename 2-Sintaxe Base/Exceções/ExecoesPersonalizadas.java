package Exceções;

/*
           - Criando exceções personalizadas -

Criar as suas próprias exceções estendendo
a classe Exception ou RuntimeException.

*/

public class ExecoesPersonalizadas extends Exception {

    public ExecoesPersonalizadas(String mensagem){
        super(mensagem);
    }
}

class Exemplo {
    public static void main(String[] args) {

        try {
            sacarDinheiro(1000 , 500); // Isso lançará uma exceção personalizada

        }catch (ExecoesPersonalizadas e){
            System.out.println(e.getMessage());

        }
    }

    static  void sacarDinheiro(double saldo , double valor) throws  ExecoesPersonalizadas{
        if (valor > saldo){
            throw  new ExecoesPersonalizadas("Saldo insuficiente para saque!");
        }
        System.out.println("Saque realizado com sucesso.");
    }
}
