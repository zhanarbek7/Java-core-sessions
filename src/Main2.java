import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Integer> list=  new ArrayList<>(List.of(1,5,2,3,44,4,5,6,7,6,8,9,11, 10,10));

        System.out.println(list.stream().mapToInt(x -> x).sum());
    }
}
