package Interfaces.Pratica;

public class Programador implements Trabalhador {
    @Override
    public void trabalhar() {
        System.out.println("Programador esta Trabalhando");
    }

    @Override
    public void descansar() {
        System.out.println("Programador esta Descansando");
    }
}
