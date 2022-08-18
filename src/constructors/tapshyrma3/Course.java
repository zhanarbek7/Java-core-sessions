package constructors.tapshyrma3;

/**
 * Author: Zhanarbek Abdurasulov
 * Date: 9/8/22
 */
public class Course {
    private String courseName;
    private String instructorName;
    private String startedAt;

    public Course(String courseName, String instructorName, String startedAt){
        this.courseName = courseName;
        if(instructorName.length()<=2)
            System.out.println("Имя инструктора введено неправильно");
        else
            this.instructorName = instructorName;
        this.startedAt = startedAt;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public String getStartedAt(){
        return startedAt;
    }
}
