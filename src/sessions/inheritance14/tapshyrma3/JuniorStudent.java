package sessions.inheritance14.tapshyrma3;

public class JuniorStudent extends Student{

    private String performance;
    private String vert;

    public JuniorStudent(String name, int age, String hobby, String gender, String teachersName,
                         String performance, String vert) {
        super(name, age, hobby, gender, teachersName);
        this.performance = performance;
        this.vert = vert;
    }

    public String getPerformance() {
        return performance;
    }

    public String getVert() {
        return vert;
    }
}
