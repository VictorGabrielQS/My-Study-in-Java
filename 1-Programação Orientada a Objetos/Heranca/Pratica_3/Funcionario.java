package Heranca.Pratica_3;

public class Funcionario {
    String nome;
    double salario;

    public Funcionario(String nome , double salario){
        this.nome = nome;
        this.salario = salario;

    }

    public void calcularSalario(){
        System.out.println("Salario Funcionário : " + salario);
    }

}
