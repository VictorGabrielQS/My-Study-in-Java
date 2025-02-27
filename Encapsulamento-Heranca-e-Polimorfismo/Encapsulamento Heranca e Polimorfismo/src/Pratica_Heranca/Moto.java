package Pratica_Heranca;

public class Moto extends Veiculo {
    public Moto(String modelo) {
        super(modelo);
    }

    void ligar() {
        System.out.println("Moto Ligada");
    }
}
