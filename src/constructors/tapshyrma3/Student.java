package constructors.tapshyrma3;

/**
 * Author: Zhanarbek Abdurasulov
 * Date: 9/8/22
 */
public class Student {
    private String studentName;
    private int age;
    private String gender;

    public Student(String studentName, int age, String gender){
        if(studentName.length()<=2)
            System.out.println("Имя инструктора введено неправильно");
        else
            this.studentName = studentName;
        if(age<1)
            System.out.println("Возраст студента введен неверно");
        else
            this.age = age;

        if(gender.equals("female")||gender.equals("male")){
            this.gender = gender;
        }
        else
            System.out.println("Пол введен неверно");
    }

    public String getStudentName() {
        return studentName;
    }

    public int getAge(){
        return age;
    }

    public String getGender() {
        return gender;
    }

}
