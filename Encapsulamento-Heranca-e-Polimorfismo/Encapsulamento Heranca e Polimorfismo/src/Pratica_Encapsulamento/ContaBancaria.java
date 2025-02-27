package Pratica_Encapsulamento;

public class ContaBancaria {

    private String titular;
    private double saldo;

    public void cadastrarTitular(String titular ,  double valor){
        this.titular = titular;
        this.saldo = valor;
    }

    public void depositar(double valor){
        this.saldo = valor + saldo;
        System.out.println("Deposito efetuado na conta " + titular + " no valor de - R$ " + valor);
    }

    public void sacar(double valor){
        if (valor <= saldo){
            this.saldo = saldo - valor;
            System.out.println("Saque efetuado na conta" + titular + "no valor de - R$ " + valor);
        }
        else {
            System.out.println("O Valor inserido ultrapassou o limite!");
        }
    }

    public double exibirSaldo(){
        return saldo;
    }

}
