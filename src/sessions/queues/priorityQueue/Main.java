package sessions.queues.priorityQueue;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("Anton");
        priorityQueue.add("Saikal");
        priorityQueue.add("Michael");
        priorityQueue.add("Tom");
        priorityQueue.add("Zyzz");
        priorityQueue.add("Bob");
        priorityQueue.add("Andrey");
        priorityQueue.add("Beckham");
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
    }



    // PriorityQueue()
    // add() vs offer()
    // add true() кайтарат негизи, бирок орун жок болсо exception ыргытат
    // offer() exception ыргытпайт
    // peek() эн башкы элементти кайтарат, эгерде пустой болсо null кайтарат
    // poll() эн башкы элементти кайтарат, жана очуруп салат, эгерде пустой болсо null кайтарат




}
