package Encapsulamento;

public class Carro {

    private String marca;
    private String modelo;
    private int ano;
    private boolean logado = false;

    public Carro(String marca , String modelo , int ano , boolean logado){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.logado = logado;
    }

    public void login(){
        this.logado = true;
    }

    public void logon(){
        this.logado = false;
    }

    public void verificarLogin(){

        if (!logado){
            throw  new IllegalStateException("Ação não permitido , É necessário estar logado !");
        }

    }

    public void setMarca(String marca){
        verificarLogin();
        this.marca = marca;

    }

    public String getMarca(){
        return marca;
    }

    public void setModelo(String modelo){
        verificarLogin();
        this.modelo = modelo;
    }

    public String getModelo(){
        return modelo;
    }

    public void setAno(int ano){
        verificarLogin();
        this.ano = ano;
    }

    public int getAno(){
        return  ano;
    }

    public void exibirInformacoes(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);

    }

    public void acelerar(int velocidade) {
        System.out.println("O carro está acelerando a " + velocidade + " km/h.");
    }

}
