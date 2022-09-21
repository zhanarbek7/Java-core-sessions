package sessions.streams.tapshyrma4;

import java.util.List;

public class Main {
    public static void main(String[] args) {















        List<String> stringList = List.of("One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten");
        stringList.forEach(x-> System.out.print(x+" "));
        System.out.println();
        List<Integer> integerList = stringList.stream().map(String::length).toList();
        integerList.forEach(x-> System.out.print(x+" "));
    }
}
