package constructors.tapshyrma3;

/**
 * Author: Zhanarbek Abdurasulov
 * Date: 9/8/22
 */
public class Main {
    public static void main(String[] args) {

        Course course1 = new Course("Java", "Muhamed","01.07.22");
        Course course2 = new Course("Javascript", "Zhasmin","01.07.22");


        Student student1 = new Student("Maksat",19,"male");
        Student student2 = new Student("Ma Long",19,"male");
        Student student3 = new Student("Ailin",25,"female");

        System.out.printf("Course1: %s, %s, %s\n", course1.getCourseName(), course1.getInstructorName(), course1.getStartedAt());
        System.out.printf("Course2: %s, %s, %s\n", course2.getCourseName(), course2.getInstructorName(), course2.getStartedAt());

        System.out.printf("Student1: %s, %d, %s\n", student1.getStudentName(), student1.getAge(), student1.getGender());
        System.out.printf("Student2: %s, %d, %s\n", student2.getStudentName(), student2.getAge(), student2.getGender());
        System.out.printf("Student3: %s, %d, %s\n", student3.getStudentName(), student3.getAge(), student3.getGender());
    }
}
