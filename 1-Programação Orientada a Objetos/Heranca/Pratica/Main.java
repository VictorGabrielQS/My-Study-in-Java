package Heranca.Pratica;

public class Main {
    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario("Renato", 3000.00);
        funcionario1.trabalhar();

        Gerente gerente1 = new Gerente("Marcus" , 10000.00);
        gerente1.trabalhar();
        gerente1.gerenciarEquipe();
        gerente1.receberSalario();

    }

}
