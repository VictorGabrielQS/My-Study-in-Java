package Encapsulamento;

public class Pessoa {


    // Atributos privados (não podem ser acessados diretamente)
    private String nome;
    private int idade;


    // Método público para acessar o nome
    public String getNome() {
        return nome;
    }

    // Método público para modificar o nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método público para acessar a idade
    public int getIdade() {
        return idade;
    }

    // Método público para modificar a idade
    public void setIdade(int idade) {
        if (idade > 0) {  // Validando a idade
            this.idade = idade;
        } else {
            System.out.println("Idade inválida");
        }
    }
}


