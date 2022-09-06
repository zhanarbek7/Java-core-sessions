package test.comparable;

import java.util.LinkedList;

public class MainLinkedList {
    public static void main(String[] args) {
        LinkedList<Student> aList = new LinkedList<>();
        aList.add(new Student(1, "Nursultan", 15));
        aList.add(new Student(2, "Maksat", 17));
        aList.add(new Student(3, "Wictor", 19));
    }
}
