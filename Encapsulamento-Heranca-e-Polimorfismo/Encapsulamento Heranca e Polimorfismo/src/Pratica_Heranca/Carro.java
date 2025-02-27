package Pratica_Heranca;

public class Carro extends Veiculo{

    public Carro(String modelo) {
        super(modelo);
    }

    void ligar() {
        System.out.println("Carro Ligado");
    }

}
