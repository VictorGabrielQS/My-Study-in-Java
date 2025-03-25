package Sobrecarga.Sobrecarga_classe.Exemplo_2;

public class Main {
    public static void main(String[] args) {
        Impressora impressora = new Impressora();

        impressora.exibir("Olá, mundo!");
        impressora.exibir(42);
        impressora.exibir(3.14);
        impressora.exibir("Repetir", 3);

    }
}
