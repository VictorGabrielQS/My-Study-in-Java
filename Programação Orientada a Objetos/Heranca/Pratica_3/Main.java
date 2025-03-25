package Heranca.Pratica_3;

public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Joao" , 2000);
        gerente.calcularSalario();
        
        Funcionario funcionario1 = new Funcionario("Tiago" , 1000);
        funcionario1.calcularSalario();


    }

}
