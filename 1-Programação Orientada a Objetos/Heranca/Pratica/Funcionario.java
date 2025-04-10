package Heranca.Pratica;

public class Funcionario {
    String nome;
    double salario;

    public Funcionario(String nome , double salario){
        this.nome = nome;
        this.salario = salario;
    }

    void trabalhar(){
        System.out.println("O funcionário : " + nome + " esta trabalhando " );
    };

}
