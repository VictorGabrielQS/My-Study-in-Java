package Objetos.Pratica_2;

public class Main {
    public static void main(String[] args) {

        Carro carro1 = new Carro();
        carro1.setMarca("Bmw");
        carro1.setModelo("320i");
        carro1.setAno(2024);
        carro1.imprimirDetalhes();

        Carro carro2 = new Carro();
        carro2.setMarca("Jeep");
        carro2.setModelo("Commander");
        carro2.setAno(2025);
        carro2.imprimirDetalhes();

        Carro carro3 = new Carro();
        carro3.setMarca("Porsche");
        carro3.setModelo("911");
        carro3.setAno(2024);
        carro3.imprimirDetalhes();

    }
}
