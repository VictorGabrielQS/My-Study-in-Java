package Heranca.Pratica;

public class Gerente extends Funcionario {

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    void gerenciarEquipe(){
        System.out.println(nome + " esta gerenciando a equipe");
    }

    void receberSalario(){
        System.out.println("Salário recebido : R$" + salario);
    }

}
