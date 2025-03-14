package Loops;


public class LoopWhile {
    public static void main(String[] args) {

        //While :

        int i = 1;

        int n = 0;

        while (i <= 5){

            System.out.println("Iteração : " + i);

            i++;
        }



        String[] nome = {"Victor" , "Marcus" , "Maria"};

        while (n < nome.length){
            System.out.println("Nome da interação : " + nome[n]);
            n++;
        }


        //do-while :

        int d = 6;

        do{
            System.out.println("Interação : " + d);
            d++;
        }while (d <= 5);


    }
}
