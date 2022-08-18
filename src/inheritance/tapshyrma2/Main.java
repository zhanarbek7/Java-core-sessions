package inheritance.tapshyrma2;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Argen", 25, "male");
        Child child1 = new Child("Nur", "Nurumbet", "Arsen", 12, "male");
        Child child2 = new Child("Sadik", "Muhammed", "Aizada", 12, "female");
        Student student = new Student("School number 93", true, "Altynbek", 17, "male");
        Student student2 = new Student("School number 33", false, "Nurzada", 13, "female");
        Adult adult = new Adult(3, true, 34000, "Nazira",29,"female");


        System.out.println("--------ALL PEOPLE----------");
        Person[] persons = {person, child1, child2, student, student2, adult};
        for (Person i: persons) {
            System.out.println(" {Type   = "+i.getClass().getSimpleName()+"}");
            System.out.println(" {Name   = "+i.getName()+"}");
            System.out.println(" {Age    = "+i.getAge()+"}");
            System.out.println(" {Gender = "+i.getGender()+"}");
            System.out.println("----------------");
        }

        Child[] children = {child1, child2,
                new Child("Moskovskaya", "Ali", "Asel", 6, "female")};

        System.out.println("-----------ONLY CHILDREN------------");
        for (Child i: children) {
            System.out.println("Type = "+i.getClass().getSimpleName());
            System.out.println("Said = "+i.getSadik());
            System.out.println("Father = "+i.getFathersName());
            System.out.println("Name = "+i.getName());
            System.out.println("Age = "+i.getAge());
            System.out.println("Gender = "+i.getGender());
            System.out.println("---------------");
        }

    }
}
