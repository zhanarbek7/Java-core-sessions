package sessions.streams.tapshyrma3;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        task3Long();
    }

    public static void task3Long(){
        List<String> AL = List.of("abcd", "bcfk", "def", "jklmn", "jprst",
                "afc", "ambn", "kmk", "qrbd", "jus");

        System.out.println("-------NATURAL-ORDER-------");
        AL.forEach(System.out::println);

        Stream<String> stream = AL.stream();

        Stream<String> streamSorted = stream.sorted();

        Consumer<String> action = (str) -> {
            System.out.println(str);
        };

        System.out.println("-------ASCENDING-ORDER-------");
        streamSorted.forEach(action);

        Comparator<String> comparator;

        comparator = (str1, str2) -> {
            return str2.compareTo(str1); // <0, ==0, >0
        };

        stream = AL.stream();

        Stream<String> streamSortedDesc = stream.sorted(comparator);

        System.out.println("-------DESCENDING-ORDER-------");
        streamSortedDesc.forEach(action);
    }

    public static void task3Short(){
        List<String> AL = List.of("abcd", "bcfk", "def", "jklmn", "jprst",
                "afc", "ambn", "kmk", "qrbd", "jus");

        System.out.println("-------NATURAL-ORDER-------");
        AL.forEach(System.out::println);

        System.out.println("-------ASCENDING-ORDER-------");
        AL.stream().sorted().forEach(System.out::println);

        Stream<String> streamSortedDesc = AL.stream().sorted(Comparator.reverseOrder());

        System.out.println("-------DESCENDING-ORDER-------");
        streamSortedDesc.forEach(System.out::println);
    }
}
