package sessions.generics25;

import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<Object> objectList = List.of(new Object(), new Object());
        genericListSuper(objectList);

        List<Number> numberList = List.of(1, 1.1, 3, 3.5);
        genericListSuper(numberList);

        List<Integer> integerList = List.of(1,2,3,4);
        genericListSuper(integerList);

        List<Double> doubleList= List.of(1.1,2.2,3.3);

    }

    public static <T> void genericVoidMethod(T parameter){
        System.out.println("Type: "+ parameter.getClass().getSimpleName());
    }

    public static <T> T genericReturnMethod(T parameter){
        System.out.println("Type: "+ parameter.getClass().getSimpleName());
        return parameter;
    }

    public static <T, G> void multipleGenericsMethod1(T parameter1, G parameter2){
        System.out.println("Type: "+ parameter1.getClass().getSimpleName());
        System.out.println("Type: "+ parameter2.getClass().getSimpleName());
    }

    public static <T, G, C> void multipleGenericsMethod2(T parameter1, G parameter2, C parameter3){
        System.out.println("Type: "+ parameter1.getClass().getSimpleName());
        System.out.println("Type: "+ parameter2.getClass().getSimpleName());
        System.out.println("Type: "+ parameter3.getClass().getSimpleName());
    }

    public static void genericListExtends(List<? extends Number> list){
        System.out.println(list);
    }

    public static void genericListSuper(List<? super Integer> list){
        System.out.println(list.get(0).getClass().getSimpleName());
        System.out.println(list);
    }




}
