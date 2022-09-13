package sessions.listsCompares.tapshyrma2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        List<Integer> list = new ArrayList<>();

        for(int i = 0 ; i < 50; i ++){
            int san = random.nextInt(0,5);
            if(san==0){
                list.add(n);
            }
            else{
                list.add(san);
            }
        }
        System.out.println(list);

        System.out.println(list);
        System.out.println(list.size());
    }
}
