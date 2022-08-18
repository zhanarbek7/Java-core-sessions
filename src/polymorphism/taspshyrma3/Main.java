package polymorphism.taspshyrma3;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Nuris", 15);
        Student student = new Student("Nursultan", 18, "Number 9", 11);
        GirlStudent girlStudent1 = new GirlStudent("Rihana", 14, "Number 1",
                7,"Mathematics", "Nuris");
        GirlStudent girlStudent2 = new GirlStudent("Taylor", 12, "Number 6",
                5,"Music", "Nuris");
        GirlStudent girlStudent3 = new GirlStudent("Billie Eilish", 12, "Number 1",
                5,"Mathematics", "Nuris");

        BoyStudent boyStudent1 = new BoyStudent("Son", 14, "Number 15",
                7,"Mathematics","Arachnophobia");
        BoyStudent boyStudent2 = new BoyStudent("Michael", 12, "Number 6",
                5,"Music", "Chronophobia");
        BoyStudent boyStudent3 = new BoyStudent("Jack", 12, "Number 1",
                5,"Mathematics", "Cloustraphobia");

        Person[] persons = {person, student, boyStudent1, boyStudent2, boyStudent3,
        girlStudent1, girlStudent2, girlStudent3};

        for (Person i: persons) {
            switch (i.getClass().getSimpleName()) {
                case "Person" -> {
                    System.out.println("Type: " + i.getClass().getSimpleName());
                    System.out.println("Name: " + i.getName());
                    System.out.println("Age: " + i.getAge());
                    i.iAmAble();
                    System.out.println("---------------");
                }
                case "Student" -> {
                    System.out.println("Type: " + i.getClass().getSimpleName());
                    System.out.println("Name: " + i.getName());
                    System.out.println("Age: " + i.getAge());
                    System.out.println("Grade: " + ((Student) i).getGrade());
                    System.out.println("Exam mark: " + ((Student) i).getExamMark());
                    System.out.println("School: " + ((Student) i).getSchoolName());
                    i.iAmAble();
                    System.out.println("---------------");
                }
                case "GirlStudent" -> {
                    System.out.println("Type: " + i.getClass().getSimpleName());
                    System.out.println("Name: " + i.getName());
                    System.out.println("Age: " + i.getAge());
                    System.out.println("Grade: " + ((GirlStudent) i).getGrade());
                    System.out.println("Exam mark: " + ((GirlStudent) i).getExamMark());
                    System.out.println("School: " + ((GirlStudent) i).getSchoolName());
                    System.out.println("Favorite subject: " + ((GirlStudent) i).getFavoriteSubject());
                    System.out.println("Teammate: " + ((GirlStudent) i).getTeammate());
                    ((GirlStudent) i).iLoveToDo();
                    i.iAmAble();
                    System.out.println("---------------");
                }
                case "BoyStudent" -> {
                    System.out.println("Type: " + i.getClass().getSimpleName());
                    System.out.println("Name: " + i.getName());
                    System.out.println("Age: " + i.getAge());
                    System.out.println("Grade: " + ((BoyStudent) i).getGrade());
                    System.out.println("Exam mark: " + ((BoyStudent) i).getExamMark());
                    System.out.println("School: " + ((BoyStudent) i).getSchoolName());
                    System.out.println("Hobby: " + ((BoyStudent) i).getHobby());
                    System.out.println("Phobia: " + ((BoyStudent) i).getPhobia());
                    ((BoyStudent) i).iHateToDo();
                    i.iAmAble();
                    System.out.println("---------------");
                }
            }

        }
        System.out.println("------ЭКЗАМЕНДЕН откон СТУДЕНТТЕР-----");
        for (Person i: persons) {
            if((i.getClass().getSimpleName().equals("Student")||
                    i.getClass().getSimpleName().equals("GirlStudent")||
                    i.getClass().getSimpleName().equals("BoyStudent"))

                    &&((Student)i).getExamMark()>=40){
                System.out.println(i.getName()+" mark: "+((Student) i).getExamMark());
            }
        }
        System.out.println("------ЭКЗАМЕНДЕН отпогон СТУДЕНТТЕР-----");
        for (Person i: persons) {
            if((i.getClass().getSimpleName().equals("Student")||
                    i.getClass().getSimpleName().equals("GirlStudent")||
                    i.getClass().getSimpleName().equals("BoyStudent"))

                    &&((Student)i).getExamMark()<40){
                System.out.println(i.getName()+" mark: "+((Student) i).getExamMark());
            }
        }


    }
}
