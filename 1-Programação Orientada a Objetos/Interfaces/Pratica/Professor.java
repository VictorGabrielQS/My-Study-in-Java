package Interfaces.Pratica;

public class Professor implements  Trabalhador  {
    @Override
    public void trabalhar() {
        System.out.println("Professor esta Trabalhando");
    }

    @Override
    public void descansar() {
        System.out.println("Professor esta Descansando");
    }
}
