package Pratica_Polimorfismo;

public class Main {
    public static void main(String[] args) {

        Impressora impressora1 = new ImpressoraLaser();

        impressora1.imprimir();

        Impressora impressora2 = new ImpressoraJatoDeTinta();
        impressora2.imprimir();

    }
}
