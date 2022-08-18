package AgaiTapshyrma;

public class Mentor extends Person{

    private Student[] students = new Student[40];

    private int indexOfNewStudent = 0;

    public Mentor(String name, int age) {
        super(name, age);
    }

    public void addStudent(Student student){
        students[indexOfNewStudent] = student;
        indexOfNewStudent++;
    }

    public void takeAnExam(){
        System.out.println("+++++МЕНТОР "+this.getName()+" ПРИНИМАЕТ ЭКЗАМЕН+++++");
        for (int i = 0; i < indexOfNewStudent; i++) {
            System.out.println("----СДАЕТ ЭКЗАМЕН "+students[i].getName()+"----");
            System.out.println("----ЕГО ВОЗРАСТ "+students[i].getAge()+"----");
            students[i].explain();
            System.out.println("-----------------------------------------------");
        }
    }

    public int getIndexOfNewStudent() {
        return indexOfNewStudent;
    }

    public Student[] getStudents() {
        return students;
    }
}
