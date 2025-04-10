package Polimorfismo.Pratica_3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<InstrumentoMusical> instrumentos = new ArrayList<>();

        instrumentos.add(new Guitarra());
        instrumentos.add(new Bateria());
        instrumentos.add(new Guitarra());

        for (InstrumentoMusical instrumento : instrumentos){
            instrumento.tocar();
        }


    }
}
