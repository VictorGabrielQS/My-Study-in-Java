package Arrays;

public class ArrayExemplo {
    public static void main(String[] args) {

        // Declarando e inicializando um array de inteiros
        int[] numeros = {10, 20, 30, 40, 50};


        // Acessando e exibindo elementos do array
        System.out.println("Primeiro número : " + numeros[0]);
        System.out.println("Terceiro número : " + numeros[2]);


        //Alterando um elemento do array
        numeros[1] = 25;
        System.out.println("Segundo número alterado : " + numeros[1]);

        //Exibindo Tamanho do array
        System.out.println("Tamanho do array : " + numeros.length);

        // Iterando sobre o array usando um loop for
        System.out.println("Elementos do array:");
        for (int i : numeros){
            System.out.println(i);
        }



    }
}
