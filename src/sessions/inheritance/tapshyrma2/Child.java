package sessions.inheritance.tapshyrma2;

public class Child extends Person{

    private String sadik;
    private String fathersName;

    public Child(String sadik, String fathersName, String name, int age, String gender) {
        super(name, age, gender);
        this.sadik = sadik;
        this.fathersName = fathersName;
    }

    public String getSadik() {
        return sadik;
    }

    public String getFathersName() {
        return fathersName;
    }

    @Override
    public String toString() {
        return "Child{" +
                "sadik='" + sadik + '\'' +
                ", fathersName='" + fathersName + '\'' +
                super.toString();
    }
}
