package Objetos.Pratica_2;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;

    //Marca
    public  void setMarca(String marca){
        this.marca = marca;
    }

    public String getMarca(){
        return marca;
    }


    //Modelo
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getModelo(){
        return modelo;
    }

    //Ano
    public void setAno(int ano){
        this.ano = ano;
    }

    public int getAno(){
        return ano;
    }


    public void imprimirDetalhes(){
        System.out.println();
        System.out.println("Marca : " +this.getMarca());
        System.out.println("Modelo : " + this.getModelo());
        System.out.println("Ano : " + this.getAno());
        System.out.println();
    }

}
