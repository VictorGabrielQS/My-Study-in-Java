package Visibilidade.Protegido;

/*
          📌 protected (Acesso no Pacote + Subclasses)

          Visível no mesmo pacote e em subclasses (mesmo que estejam em outro pacote).
*/

public class PessoaProtected {
    protected String nome; // Atributo Protegido

    protected void exibirNome(){ // Método Protegido
        System.out.println(nome);
    }

}
