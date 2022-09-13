package sessions.setEqualsHash.tapshyrma1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedHashSet<Student> students1 = new LinkedHashSet<>();

        students1.add(new Student("Samarbek",40, "MALE"));
        students1.add(new Student("Nurislam",5, "MALE"));


        Iterator<Student> iterator = students1.iterator();
        System.out.println(students1.size());
        while(iterator.hasNext()){
            if(iterator.next().getAge() < 20){
                iterator.remove();
            }
        }
    }
}
