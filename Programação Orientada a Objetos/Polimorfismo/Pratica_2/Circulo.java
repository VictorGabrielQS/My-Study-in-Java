package Polimorfismo.Pratica_2;

public class Circulo extends Forma {

    double raio;

     public Circulo(double raio){
         this.raio = raio;
     }


    @Override
    public double calcularArea() {
        return 3.14159 * (raio * raio);
    }


}
