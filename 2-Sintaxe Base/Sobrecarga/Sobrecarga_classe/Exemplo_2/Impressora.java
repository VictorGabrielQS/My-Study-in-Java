package Sobrecarga.Sobrecarga_classe.Exemplo_2;

public class Impressora {

    // Exibe uma String
    public void exibir(String mensagem){
        System.out.println("String : " + mensagem);
    }


    // Sobrecarga: exibe um int
    public void exibir(int numero){
        System.out.println("Int : " + numero);
    }


    // Sobrecarga: exibe um double
    public void exibir(double numero){
        System.out.println("Double : " + numero);
    }

    // Sobrecarga: exibe String e int
    public void exibir(String mensagem , int vezes){
        for (int i = 0; i < vezes; i++){
            System.out.println(mensagem);
        }
    }

}
