import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"Andrey");
        map.put(2,"Maksat");
        map.put(3,"Azamat");
        map.put(4,"Kurmanbek");
        map.put(5,"Argen");

        for (Map.Entry<Integer, String> entry: map.entrySet()) {
            System.out.println("key = "+entry.getKey()+", value = "+entry.getValue());
        }

        System.out.println();
        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println("key = "+entry.getKey()+", value = "+entry.getValue());
        }

        System.out.println();
        Set<Integer> set = map.keySet();
        for (Integer i: set) {
            System.out.println(i);
        }

        System.out.println();
        List<String> list = new ArrayList<>(map.values());
        for (String i: list) {
            System.out.println(i);
        }

    }
}
