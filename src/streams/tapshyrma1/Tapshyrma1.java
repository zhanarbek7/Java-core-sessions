package streams.tapshyrma1;

import java.util.ArrayList;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Tapshyrma1 {
    static Random random = new Random();
    public static void main(String[] args) {
        task1Short();
    }

    public static void task1Long(){
        ArrayList<Integer> arrayList = new ArrayList<>(20);

        for (int i = 0; i < 20; i++) {
            arrayList.add(random.nextInt(1,100));
        }

        Stream<Integer> integerStream1 = arrayList.stream();
        Stream<Integer> integerStream2 = arrayList.stream();

        Predicate<Integer> pr = x -> (x%2) == 0;

        Stream<Integer> restStream1 = integerStream1.filter(pr);
        Stream<Integer> restStream2 = integerStream2.filter(pr);

        System.out.println("Количество четных чисел: "+restStream1.count());

        System.out.print("Четные числа: ");

        Consumer<Integer> cons = (x)-> System.out.print(x+" ");

        restStream2.forEach(cons);
    }

    public static void task1Short(){
        ArrayList<Integer> arrayList = new ArrayList<>(20);

        for (int i = 0; i < 20; i++) {
            arrayList.add(random.nextInt(1,100));
        }

        System.out.println("Количество четных чисел: "+arrayList.stream().filter(x -> (x%2) == 0).count());

        System.out.print("Четные числа: ");

        arrayList.stream().filter(x -> (x%2) == 0).forEach((x)->System.out.print(x+" "));
    }
}
