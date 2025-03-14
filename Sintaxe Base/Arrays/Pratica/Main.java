package Arrays.Pratica;

public class Main {
    public static void main(String[] args) {

        int[] numeros = new int[10];

        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;
        numeros[5] = 6;
        numeros[6] = 7;
        numeros[7] = 8;
        numeros[8] = 9;
        numeros[9] = 10;


        for (int i : numeros ){
            if (i % 2  == 0){
                System.out.println("Esse numero e Par: " + i);

            }
            else {
                System.out.println("Esse numero não e par: " + i);

            }
        }


    }
}
