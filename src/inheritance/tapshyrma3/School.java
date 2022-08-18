package inheritance.tapshyrma3;

public class School {

    private String city;
    private int year;
    private String directorsName;
    private int numberOfTeachers;
    private Student[] students = new Student[70];
    private int indexOfNewStudent = 0;

    public School(String city, int year, String directorsName, int numberOfTeachers) {
        this.city = city;
        this.year = year;
        this.directorsName = directorsName;
        this.numberOfTeachers = numberOfTeachers;
    }


    public void addStudent(Student student){
        this.students[indexOfNewStudent] = student;
        indexOfNewStudent++;
    }

    public String getCity() {
        return city;
    }

    public int getYear() {
        return year;
    }

    public String getDirectorsName() {
        return directorsName;
    }

    public int getNumberOfTeachers() {
        return numberOfTeachers;
    }

    public Student[] getStudents() {
        return students;
    }

    public int getIndexOfNewStudent() {
        return indexOfNewStudent;
    }
}
