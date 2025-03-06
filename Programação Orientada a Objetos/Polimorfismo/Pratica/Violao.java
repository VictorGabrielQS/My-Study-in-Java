package Polimorfismo.Pratica;

public class Violao extends InstrumentoMusical {
    @Override
    void tocar() {
        System.out.println("Esta sendo tocado o Violão");
    }
}
