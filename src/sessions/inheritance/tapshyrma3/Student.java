package sessions.inheritance.tapshyrma3;

import java.util.Random;

public class Student{

    private String name;
    private int age;
    private String hobby;
    private String gender;
    private String teachersName;
    private int sumOfMarks;

    public Student(String name, int age, String hobby, String gender, String teachersName) {
        Random random = new Random();
        this.name = name;
        this.age = age;
        this.hobby = hobby;
        this.gender = gender;
        this.teachersName = teachersName;
        this.sumOfMarks = random.nextInt(10,101);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getHobby() {
        return hobby;
    }

    public String getGender() {
        return gender;
    }

    public String getTeachersName() {
        return teachersName;
    }

    public int getSumOfMarks() {
        return sumOfMarks;
    }
}
