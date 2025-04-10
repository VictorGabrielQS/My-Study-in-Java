package Visibilidade.Privado;

/*
         📌 private (Acesso apenas na Classe)

         Restrito apenas à própria classe.

 */

public class PessoaPrivate {

    private String nome;

    private void exibirNome(){
        System.out.println(nome);
    }


    //Métodos gets e sets

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

}
