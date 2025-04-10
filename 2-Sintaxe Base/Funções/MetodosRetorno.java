package Funções;

public class MetodosRetorno {

    //Metodo com retorno int

    public static int Somar(int a , int b){
        return a + b;
    }

    public static String NomeCompleto(String primeiroNome , String segundoNome){

        return primeiroNome + " " + segundoNome;

    }

    public static void main(String[] args) {
        int resultado = Somar(10 , 10);
        System.out.println(resultado);

        String nomeCompleto = NomeCompleto("Victor" , "Gabriel");
        System.out.println(nomeCompleto);

    }

}
