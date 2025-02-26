package Exercicio_1;

public class Carro {
      public String marca;
      public String modelo;

      public Carro (String marca , String modelo){
          this.marca = marca;
          this.modelo = modelo;
      }

      public void obterInformacoes(){
          System.out.println("As Informações do carro são" + " Marca : " + marca + " Modelo : " + modelo);
      }
}
