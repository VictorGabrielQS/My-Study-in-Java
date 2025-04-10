package Visibilidade.Publico;

/*
         📌 public (Acesso Total)

         Qualquer classe em qualquer pacote pode acessar.
 */

public class PessoaPublic {

    public String nome; // Atributo público

    public void exibirNome(){         // Método público
        System.out.println(nome);
    }

}
