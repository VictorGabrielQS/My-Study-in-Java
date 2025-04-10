package Classes.Pratica_3;

public class Livro {
    String titulo;
    String autor;
    int numeroPaginas;

    public Livro(String titulo , String autor , int numeroPaginas){
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public void getInfoLivro(){
        System.out.println("Titulo : " + titulo);
        System.out.println("Autor : " + autor);
        System.out.println("Numero de paginas : " + numeroPaginas);
    }
}
