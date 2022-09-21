package streams.tapshyrma2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        task2Short();
    }

    public static void task2Long(){
        String s;
        ArrayList<String> AL = new ArrayList<>();

        System.out.println("Enter names: ");
        while (true) {
            System.out.print("name = ");
            s = scanner.nextLine();
            if (s.equals(""))
                break;
            AL.add(s);
        }
        System.out.println();

        System.out.println("AL = " + AL);


        Predicate<String> fn = (str) -> {
            if (str.charAt(0)=='A')
                return true;
            return false;
        };

        Consumer<String> cons = (x) -> System.out.print(x+" ");

        Stream<String> stream1 = AL.stream();
        Stream<String> stream2 = AL.stream();

        Stream<String> resStream1 = stream1.filter(fn);

        Stream<String> resStream2 = stream2.filter(fn);


        System.out.print("STARTING with A: ");
        resStream2.forEach(cons);

        System.out.println("\ncount = " + resStream1.count());
    }

    public static void task2Short(){
        String s;
        ArrayList<String> AL = new ArrayList<>();

        System.out.println("Enter names: ");
        while (true) {
            System.out.print("name = ");
            s = scanner.nextLine();
            if (s.equals(""))
                break;
            AL.add(s);
        }
        System.out.println("AL = " + AL);

        System.out.print("STARTING with A: ");
        AL.stream().filter((str) -> str.charAt(0) == 'A').forEach((x) -> System.out.print(x+", "));

        System.out.println("\ncount = " + AL.stream().filter((str) -> str.charAt(0) == 'A').count());
    }
}
