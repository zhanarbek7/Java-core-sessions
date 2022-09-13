package sessions.generics25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        System.out.println(methodArrayListGeneric(new ArrayList<>(Arrays.asList(1, 1, 2, 3))));
    }

    public static <T extends String> T method(T variable){
        System.out.println(variable.getClass().getSimpleName());
        return variable;
    }

    public static <T> T genericMethod(T parameter1){
        return parameter1;
    }

    public static <T extends Person> T generic(T parameter){
        System.out.println(parameter.getClass().getSimpleName());
        return parameter;
    }
    public static void genericList(List<? extends Number> list){
        System.out.println(list);
    }

    public static <T extends Number> void genericList2(List<T> list){
        System.out.println(list);
    }

    public static void genericLowerBound(List<? super Student> list) {
        System.out.println(list);
    }


    public static <T> ArrayList<T> methodArrayList(ArrayList<T> arrayList){
        return arrayList;
    }

    public static ArrayList<Integer> methodArrayListGeneric(ArrayList<Integer> arrayList){
        return arrayList;
    }






}
