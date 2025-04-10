package Collections_Framework.Deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

//Deque - Permitem inserção/remoção nos dois extremos , Pode ser usado tanto como pilha (LIFO) quanto como fila (FIFO).


public class Main {
    public static void main(String[] args) {

        Deque<String> deque = new ArrayDeque<>();

        deque.push("A");
        deque.push("B");
        deque.push("C");

        String itemRemovido = deque.pop(); // Remove o ultimo item adicionado da lista
        System.out.println("Item Removido : " + itemRemovido);
        System.out.println(deque);


        //LinkedList - Fila Dupla
        Deque<String> dequeLinkedList = new LinkedList<>();
        dequeLinkedList.addFirst("Primeiro"); // adiciona no inicio
        dequeLinkedList.addLast("Ultimo"); // adiciona no final

        System.out.println(dequeLinkedList);
        System.out.println(deque.removeFirst()); // "Primeiro"
        System.out.println(deque.removeLast());  // "Último"



    }
}
