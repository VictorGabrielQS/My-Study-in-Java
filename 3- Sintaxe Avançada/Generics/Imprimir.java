package Generics;

//Definir a classe como generics - ok
//Definir tipo de dado da classe como Generico - ok
//Definir construtor da classe com o Tipo Generico - ok



public class Imprimir <T> {
    public T conteudo;

    public Imprimir(T conteudo){
        this.conteudo = conteudo;
    }

    public T exibirImprimir(){
        return conteudo;
    }

}
