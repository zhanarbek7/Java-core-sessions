package sessions.constructors13.tapshyrma3n1;

/**
 * Author: Zhanarbek Abdurasulov
 * Date: 9/8/22
 */
public class Main {
    public static void main(String[] args) {

        Course course1 = new Course("Java", "Muhamed","01.07.22" ,
                "9 month","Grajdanskaya 119");


        Student student1 = new Student("Maksat",19,"male",
                23, "A1", "OFFLINE");
        Student student2 = new Student("Ma Long",19,"male",
                29, "A2", "OFFLINE");
        Student student3 = new Student("Ailin",25,"female",
                17, "B!", "ONLINE");

        course1.addStudent(student1);
        course1.addStudent(student2);
        course1.addStudent(student3);

        System.out.println("----COURSE DETAILS----");
        System.out.println("COURSE NAME: "+course1.getCourseName());
        System.out.println("INSTRUCTOR NAME: "+course1.getInstructorName());
        System.out.println("START DATE: "+course1.getStartedAt());
        System.out.println("COURSE LENGTH: "+course1.getCourseLength());
        System.out.println("COURSE ADDRESS: "+course1.getCourseAddress());
        System.out.println("Minimum Typing Speed: "+course1.getMinimumTypingSpeed());

        System.out.println("---------------------");
        System.out.println("Students passed = "+(course1.getLastStudentIndex()));
        System.out.println("Students rejected = "+course1.getRejectedStudents());

        System.out.println("\n----STUDENTS PASSED DETAILS----");
        for (int i = 0; i < course1.getLastStudentIndex(); i++) {
            Student[] passedStudents = course1.getStudents();

            System.out.println("NAME : "+ passedStudents[i].getStudentName());
            System.out.println("AGE : "+ passedStudents[i].getAge());
            System.out.println("GENDER : "+ passedStudents[i].getGender());
            System.out.println("TYPING SPEED : "+ passedStudents[i].getTypingSpeed());
            System.out.println("ENGLISH LEVEL : "+ passedStudents[i].getEnglishLevel());
            System.out.println("STUDY FORMAT : "+ passedStudents[i].getStudyFormat());
            System.out.println("-----------------------");
        }

    }
}
