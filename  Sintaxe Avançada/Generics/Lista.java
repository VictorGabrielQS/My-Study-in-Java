package Generics;

import java.util.ArrayList;
import java.util.List;

public class Lista <T> {
    private  List<T> lista = new ArrayList<>();

    public List<T> exibirLista(){
        return lista;
    }

    public void adicionarLista(T item){
        lista.add(item);

    }

    public void removerItemLista(T item){
        lista.remove(item);

    }


}
