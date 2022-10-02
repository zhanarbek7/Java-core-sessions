package sessions.queues.arrayDeque;

import javax.print.DocFlavor;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.add("Anton");
        arrayDeque.add("Saikal");
        arrayDeque.add("Michael");
        arrayDeque.add("Tom");
        arrayDeque.add("Zyzz");
        arrayDeque.add("Bob");
        arrayDeque.add("Andrey");
        arrayDeque.add("Beckham");

    }
    // ArrayDeque()
    // add(), addLast(), offer() жана offerLast() аягына кошот
    // push(), offerFirst(), addFirst() башына кошот
    // getFirst() биринчи элементти кайтарат бирок очурбойт, пустой болсо exception ыргытат
    // getLast() акыркы элементти кайтарат бирок очурбойт, пустой болсо exception ыргытат
    // peek() биринчи элементти кайтарат бирок очурбойт, пустой болсо null кайтарат
    // peekFirst() биринчи элементти кайтарат бирок очурбойт, пустой болсо null кайтарат
    // peekLast() акыркы элементти кайтарат бирок очурбойт, пустой болсо null кайтарат
    // poll() биринчи элементти кайтарат жана очурот, пустой болсо null кайтарат
    // pollFirst() биринчи элементти кайтарат жана очурот, пустой болсо null кайтарат
    // pollLast() акыркы элементти кайтарат жана очурот, пустой болсо null кайтарат
    // pop() биринчи элементти кайтарат жана очурот, пустой болсо exception кайтарат

}

