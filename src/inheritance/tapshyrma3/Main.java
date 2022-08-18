package inheritance.tapshyrma3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        School school = new School("Bishkek", 1999, "Mamytkon Nursultan", 38);

        JuniorStudent juniorStudent1 = new JuniorStudent("Maksat", 12, "football", "male",
                "Baktygul", "good", "introvert");
        JuniorStudent juniorStudent2 = new JuniorStudent("Aitemir", 13, "volleyball", "male",
                "Baktygul", "good", "extrovert");
        JuniorStudent juniorStudent3 = new JuniorStudent("Mirgul", 8, "swimming", "female",
                "Baktygul", "bad", "ambivert");

        SeniorStudent seniorStudent1 = new SeniorStudent("Alex", 17, "diving", "male",
                "Bakai", "Physical education");
        SeniorStudent seniorStudent2 = new SeniorStudent("Syimyk", 19, "dancing", "male",
                "Bakai", "Music");

        // Студенттерди мектеп деген объектини ичиндеги students массивине кошуу
        school.addStudent(juniorStudent1);
        school.addStudent(juniorStudent2);
        school.addStudent(juniorStudent3);
        school.addStudent(seniorStudent1);
        school.addStudent(seniorStudent2);

        Student[] students = school.getStudents();

        System.out.println("-----------PASSED STUDENTS--------------");
        for (int i = 0; i < school.getIndexOfNewStudent(); i++) {
            if (students[i].getSumOfMarks()>50) {
                System.out.println("Type of student: " + students[i].getClass().getSimpleName());
                System.out.println("Name: " + students[i].getName());
                System.out.println("Age: " + students[i].getAge());
                System.out.println("Gender: " + students[i].getGender());
                System.out.println("Hobby: " + students[i].getHobby());
                System.out.println("Teacher: " + students[i].getTeachersName());
                System.out.println("Marks: " + students[i].getSumOfMarks());
                System.out.println("------------------------");
            }
        }


        System.out.println("\n-----------REJECTED STUDENTS--------------");
        for (int i = 0; i < school.getIndexOfNewStudent(); i++) {
            if (students[i].getSumOfMarks()<50) {
                System.out.println("Type of student: " + students[i].getClass().getSimpleName());
                System.out.println("Name: " + students[i].getName());
                System.out.println("Age: " + students[i].getAge());
                System.out.println("Gender: " + students[i].getGender());
                System.out.println("Hobby: " + students[i].getHobby());
                System.out.println("Teacher: " + students[i].getTeachersName());
                System.out.println("Marks: " + students[i].getSumOfMarks());
                System.out.println("------------------------");
            }
        }
    }
}
