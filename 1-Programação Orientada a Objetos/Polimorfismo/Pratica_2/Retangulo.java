package Polimorfismo.Pratica_2;

public class Retangulo extends Forma{

    double largura;
    double altura;

    public Retangulo(double largura , double altura){
        this.largura = largura;
        this.altura = altura;
    }


    @Override
    public double calcularArea() {
        return largura * altura;
    }


}
