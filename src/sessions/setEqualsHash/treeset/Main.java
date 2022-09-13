package sessions.setEqualsHash.treeset;// Java code to illustrate
// Set containsAll()

import sessions.setEqualsHash.NameComparator;
import sessions.setEqualsHash.tapshyrma1.Student;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Comparator<Student> nameComparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        Set<Student> students = new TreeSet<>(nameComparator);
        students.add(new Student("Samarbek",40, "MALE"));
        students.add(new Student("Samarbek",45, "MALE"));
        students.add(new Student("Nurtilek",16, "MALE"));
        students.add(new Student("Mirgul",32, "FEMALE"));
        students.add(new Student("Aisalbek",21, "MALE"));
        students.add(new Student("Nuris",50, "MALE"));

        System.out.println(students);

        Iterator<Student> studentIterator = students.iterator();

        while(studentIterator.hasNext()){
            Student student = studentIterator.next();
            System.out.println("Name: "+student.getName());
            System.out.println("Age: "+student.getAge());
            System.out.println("---------");
        }


    }
}

