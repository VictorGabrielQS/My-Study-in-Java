package Heranca.Exemplo;

public class Veiculo {

    //Atributos
    private String marca;
    private String modelo;
    private int ano;

    //Construtor
    public Veiculo(String marca , String modelo , int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;

    }

    //Métodos
    public void exibirInformacoes() {
        System.out.println("Marca : " + marca );
        System.out.println("Modelo : " + modelo);
        System.out.println("Ano : " + ano);
    }

    public void acelerar(int velocidade){
        System.out.println("O carro " + marca + "esta acelerando " + velocidade + "km/h");
    }

}
