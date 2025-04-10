package Heranca.Pratica_3;

public class Gerente extends Funcionario {
    double bonus = 2.0;


    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    public void calcularSalario( ){
        double calculo = salario * (bonus / 100.0);
        double salarioTotal = salario + calculo;
        System.out.println("Salario : "  + salarioTotal );
    }

}
