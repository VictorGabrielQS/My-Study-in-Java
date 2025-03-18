package Exceções;

/*
                               - throws -

Se um método pode lançar uma exceção verificada, você deve declará-la usando
a palavra-chave throws. Isso informa ao chamador que ele precisa tratar a exceção.

*/


import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throws {
    public static void main(String[] args) {
        try {
            abrirArquivo("arquivo_inexistente.txt");
        }catch (FileNotFoundException e){
            System.out.println("Erro: Arquivo não encontrado!");
        }
    }
    static void abrirArquivo(String nomeArquivo) throws FileNotFoundException{
        FileInputStream arquivo = new FileInputStream(nomeArquivo);
    }
}
