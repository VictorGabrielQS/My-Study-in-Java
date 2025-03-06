package Classes;

public class ConstrutorCarro {
    String marca;
    String modelo;
    int ano;

    //Construtor
    public ConstrutorCarro(String marca , String modelo , int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }


    //Metodos
    void exibirInformacoes(){
        System.out.println("Marca : " + marca);
        System.out.println("Modelo : " + modelo);
        System.out.println("Ano : " + ano);

    }

    public static void main(String[] args) {

        //Instanciando a Classe
        ConstrutorCarro carro1 = new ConstrutorCarro("Toyota", "Corolla", 2022);
        ConstrutorCarro carro2 = new ConstrutorCarro("Honda", "Civic", 2021);


        //Usando os metodos
        carro1.exibirInformacoes();
        carro2.exibirInformacoes();

    }

}
