package Visibilidade.Privado;

public class Main {
    public static void main(String[] args) {

        PessoaPrivate pessoa =  new PessoaPrivate();
        //pessoa.nome = "Pietro"  - Não e possivel atribuir, pois o atributo e privado, so e permitido modificar direto dentro da classe ou através de métodos sets e gets

        pessoa.setNome("Pietro"); // Utilizando set

        System.out.println(pessoa.getNome()); //Utilizando get


    }
}
