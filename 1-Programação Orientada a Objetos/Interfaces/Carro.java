package Interfaces;

public class Carro implements Veiculo {

    @Override
    public void acelerar() {
        System.out.println("O carro esta Acelerando ...");
    }

    @Override
    public void frear() {
        System.out.println("O carro esta Freando ...");

    }
}

