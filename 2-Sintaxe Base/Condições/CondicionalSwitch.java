package Condições;

public class CondicionalSwitch {
    public static void main(String[] args) {

        int diaSemana = 3 ;
        String nomeDia;

        switch (diaSemana) {

            case 1: nomeDia = "Domingo"; break;
            case 2: nomeDia = "Segunda-Feira"; break;
            case 3: nomeDia = "Quarta-Feira"; break;
            case 4: nomeDia = "Quinta-Feira"; break;
            case 5: nomeDia = "Sexta-Feira"; break;
            default: nomeDia = "Dia invalido"; break;

        }

        System.out.println("Dia da semana: " + nomeDia);

    }
}
