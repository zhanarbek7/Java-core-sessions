package sessions.polymorphism.taspshyrma3;

public class GirlStudent extends Student{
    private String favoriteSubject;
    private String teammate;

    public void iLoveToDo(){
        System.out.println("I love to play a piano");
    }

    public GirlStudent(String name, int age, String schoolName, int grade,
                       String favoriteSubject, String teammate) {
        super(name, age, schoolName, grade);
        this.favoriteSubject = favoriteSubject;
        this.teammate = teammate;
    }

    public String getFavoriteSubject(){
        return favoriteSubject;
    }

    public String getTeammate(){
        return teammate;
    }
}
