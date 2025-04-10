package DataTypes.Pratica.Exercicio_1;

 /*

Desafio 1

Crie um programa que declare variáveis de cada tipo primitivo (int, double, char, boolean)
e também uma variável String. Imprima todas elas formatadas em um parágrafo que descreva um
perfil (ex.: "João tem 30 anos, mede 1.80m...").

*/

public class main {
    public static void main(String[] args) {

        String nome = "João";
        int idade = 30;
        double altura = 1.75;
        char tipoSangue = 'A';
        boolean dirige = true;

        System.out.println(nome + " tem " + idade + " anos, mede " + altura +"m seu tipo de sangue e " + tipoSangue + (dirige ? " e ele dirige" : " e ele não dirige.")  );


    }
}
