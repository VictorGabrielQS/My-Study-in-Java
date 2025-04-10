package Collections_Framework.Queue;

// Queue (Filas) - Seguem o princípio FIFO (First-In, First-Out) o primeiro a entrar e o primeiro a sair . Principais implementações:

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {
    public static void main(String[] args) {

        // LinkedList
        Queue<String> queue = new LinkedList<>();

        // Adicionando elementos à fila
        queue.add("A");
        queue.add("B");
        queue.add("C");

        System.out.println("Fila: " + queue);

        // Removendo elemento (FIFO)
        System.out.println("Removido : " + queue.poll());
        System.out.println("Fila após remoção : " + queue);


        //PriorityQueue
        Queue<Integer> priorityQueue = new PriorityQueue<>();

        // Adicionando elementos
        priorityQueue.add(5);
        priorityQueue.add(1);
        priorityQueue.add(3);

        System.out.println("PriorityQueue: " + priorityQueue);

        // Removendo elementos (menor elemento sai primeiro)
        System.out.println("Removido: " + priorityQueue.poll());
        System.out.println("PriorityQueue após remoção: " + priorityQueue);



        // ArrayBlockingQueue - Usada em ambientes multi-thread para controle de acesso concorrente.

        Queue<String> arrayBlockingQueue = new ArrayBlockingQueue<>(3);

        // Adicionando elementos à fila
        arrayBlockingQueue.add("X");
        arrayBlockingQueue.add("Y");
        arrayBlockingQueue.add("Z");

        System.out.println("ArrayBlockingQueue: " + arrayBlockingQueue);

        // Tentando adicionar mais um elemento (bloquearia se estivesse cheia)
        boolean success = arrayBlockingQueue.offer("W"); // Retorna false se não conseguir adicionar
        System.out.println("Tentativa de adicionar W: " + success);

        // Removendo elemento
        System.out.println("Removido: " + arrayBlockingQueue.poll());
        System.out.println("ArrayBlockingQueue após remoção: " + arrayBlockingQueue);

    }
    }

