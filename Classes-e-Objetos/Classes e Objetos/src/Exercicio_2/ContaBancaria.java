package Exercicio_2;

public class ContaBancaria {
    private String nameUser;
    private String cpfUser;
    private double saldoUser;

    public ContaBancaria(String nameUser , String cpfUser , double saldoUser){
        this.nameUser = nameUser;
        this.cpfUser = cpfUser;
        this.saldoUser = saldoUser;

    }

    public double getSaldo(){
        return saldoUser;
    }

    public double setSaldo(double saldoAtual){
        this.saldoUser = saldoUser + saldoAtual;
        return saldoUser;
    }

    public void removeSaldo(double saldoRemove){
        if (saldoRemove <= saldoUser){
            this.saldoUser = saldoUser - saldoRemove;
            System.out.println("Valor removido com Sucesso agora o Valor presente na conta e : " );
            System.out.println("R$" + saldoUser);

        }else{

            System.err.println("O valor ultrapassou o saldo que existe na conta , então não podera ser realizado o saque.");
        }
    }


}
