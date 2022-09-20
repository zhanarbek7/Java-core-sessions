package sessions.inheritance14.tapshyrma2;

public class Student extends Person{

    private String schoool;
    private boolean relationship;

    public Student(String schoool, boolean relationship, String name, int age, String gender) {
        super(name, age, gender);
        this.schoool = schoool;
        this.relationship = relationship;
    }


    public String getSchoool() {
        return schoool;
    }

    public boolean isRelationship() {
        return relationship;
    }

    @Override
    public String toString() {
        return "Student{" +
                "schoool='" + schoool + '\'' +
                ", relationship=" + relationship +
                super.toString();
    }
}

