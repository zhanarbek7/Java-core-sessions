package sessions.listsCompares.tapshyrma1;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list1.add(random.nextInt(0,10));
            list2.add(random.nextInt(0,10));
        }

    }

    public static void intersection(ArrayList<Integer> list1, ArrayList<Integer> list2){
        System.out.println(list1);
        list1.retainAll(list2);
        System.out.println(list1);
    }

    public static void uniqueNumbersInList1(ArrayList<Integer> list1, ArrayList<Integer> list2){
        System.out.println(list1);
        list1.removeAll(list2);
        System.out.println(list1);
    }

    public static void uniqueNumbersInList2(ArrayList<Integer> list1, ArrayList<Integer> list2){
        System.out.println(list2);
        list2.removeAll(list1);
        System.out.println(list2);
    }
}
