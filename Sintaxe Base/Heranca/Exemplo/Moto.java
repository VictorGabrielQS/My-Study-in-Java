package Heranca.Exemplo;

public class Moto extends Veiculo{
    // Atributo adicional
    private boolean partidaEletrica;


    public Moto(String marca, String modelo, int ano , boolean partidaEletrica) {
        super(marca, modelo, ano); //chama o construtor da superClasse
        this.partidaEletrica = partidaEletrica;
    }

    //Metodo adicional
    public void empinar(){
        System.out.println("Empinar moto!");
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Partida eletrica : " + (partidaEletrica ? "Sim" : "Não"));
    }

}
