package Objetos.Pratica;

public class Celular {

    String marca;
    String modelo;
    int bateria = 100;

    public Celular(String marca , String modelo){
        this.marca = marca;
        this.modelo = modelo;

    }

    void usarCelular(int minutos){
        this.bateria = bateria - minutos ;

        if (bateria > 0) {
            System.out.println("A bateria descarregou " + minutos + "%," + " Atualmente a bateria esta : " + bateria + "%, Dispositivo : " + modelo);
        }else {
            System.err.println("O celular esta descarregado");
        }

    }

    public static void main(String[] args) {

        Celular meuCelular = new Celular("Samsung" , "S23" );
        meuCelular.usarCelular(10);


        Celular celular2 = new Celular("Xiaomi" , "Poco M4 Pro" );
        celular2.usarCelular(50);


    }

}
