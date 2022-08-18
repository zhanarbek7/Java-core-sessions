package constructors.tapshyrma3n1;

/**
 * Author: Zhanarbek Abdurasulov
 * Date: 9/8/22
 */
public class Student {
    private String studentName;
    private int age;
    private String gender;

    private int typingSpeed;

    private String englishLevel;

    private String studyFormat;

    public Student(String studentName, int age, String gender,
                   int typingSpeed, String englishLevel, String studyFormat
                   ){
        if(studentName.length()<=2)
            System.out.println("Имя: "+ studentName+" студента введено неправильно");
        else
            this.studentName = studentName;
        if(age<1)
            System.out.println("Возраст: "+age+ "студента введен неверно");
        else
            this.age = age;

        if(gender.equals("female")||gender.equals("male")){
            this.gender = gender;
        }
        else
            System.out.println("Пол для "+studentName+" введен неверно");
        this.typingSpeed = typingSpeed;
        this.englishLevel = englishLevel;
        this.studyFormat = studyFormat;
    }

    public Student(String name){
        this.studentName = name;
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

    public int getTypingSpeed(){
        return typingSpeed;
    }

    public String getEnglishLevel(){
        return englishLevel;
    }

    public String getStudyFormat(){
        return studyFormat;
    }

}
