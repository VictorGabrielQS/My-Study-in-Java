package Variavel.Pratica;

public class Soma {

    int numero_1;
    int numero_2;
    double media;

    public void adicao(){
        System.out.println("Adição : " + (numero_1 + numero_2) );
    }

    public void subtracao(){
        System.out.println("Subtração : " + (numero_1 - numero_2) );
    }

    public void multiplicacao(){
        System.out.println("Multiplicação : " + (numero_1 * numero_2) );
    }

    public void divisao(){
        double divisao = (double)  numero_1 / numero_2;
        System.out.println("Divisão : " + divisao);
    }

    public void media(){
        media = (double) (numero_1 + numero_2) / 2;
        System.out.println("Media : " + media);
    }



}
