package test.comparable;

import java.util.ArrayList;

public class MainArrayList {
    public static void main(String[] args) {
//         Comparable implemented on age
        ArrayList<Student> aList = new ArrayList<>();
        aList.add(new Student(1, "Nursultan", 15));
        aList.add(new Student(2, "Maksat", 17));
        aList.add(new Student(3, "Wictor", 19));
//
//        aList.sort(Collections.reverseOrder());
//        for (Student i: aList) {
//            System.out.println(i.getId() + " " + i.getName() + " " + i.getAge());
//        }

        aList.sort(new NameComparator());
                for (Student i: aList) {
            System.out.println(i.getId() + " " + i.getName() + " " + i.getAge());
        }
    }
}
