package Heranca.Exemplo;

public class Carro extends Veiculo{

    //Atributos adicional
    private int quantidadePortas;

    public Carro(String marca, String modelo, int ano , int quantidadePortas) {
        super(marca, modelo, ano);
        this.quantidadePortas = quantidadePortas;

    }

    //Metodo adicional
    public void abrirPorta(){
        System.out.println("Abrindo porta do carro");

    }

    // Sobrescrevendo o metodo da superclasse
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes(); // Chama o metodo da superClasse
        System.out.println("Quantidade de portas : " + quantidadePortas);

    }
}
