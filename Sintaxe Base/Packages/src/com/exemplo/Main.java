package Packages.src.com.exemplo;

import Packages.src.com.exemplo.model.Pessoa;
import Packages.src.com.exemplo.util.DateUtils;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João" , 25);
        System.out.println("Nome : " + pessoa.getNome());

        String dataFormatada = DateUtils.formatarData(new Date()); // Pega a data de hoje
        System.out.println("Data: " + dataFormatada);

    }
}
