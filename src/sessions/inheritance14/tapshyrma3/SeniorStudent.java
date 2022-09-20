package sessions.inheritance14.tapshyrma3;

public class SeniorStudent extends Student{

    private String favoriteSubject;
    private int numberOfClassMates;
    private int examResult;

    public SeniorStudent(String name, int age, String hobby, String gender, String teachersName, String favoriteSubject) {
        super(name, age, hobby, gender, teachersName);
        this.favoriteSubject = favoriteSubject;
    }

    public String getFavoriteSubject() {
        return favoriteSubject;
    }

    public int getNumberOfClassMates() {
        return numberOfClassMates;
    }

    public int getExamResult() {
        return examResult;
    }
}
