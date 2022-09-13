package sessions.listsCompares.tapshyrma3;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static Random random = new Random();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        int number = scanner.nextInt();

        System.out.println(method(list, number));
    }


    public static LinkedList<Integer> method(LinkedList<Integer> list, int n){
        for(int i = 0; i < 10; i++){
            list.add(random.nextInt(1,10));
        }
        System.out.println(list);
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) % 2 ==0){
                list.set(i, list.get(i) * n);
            }
        }
        return list;
    }
}
