package sessions.anonymFunctional27;

public class Personn {
    private String name;
    private int age;
    private Genderr gender;

    private String futureName;

    private Genderr futureGender;

    public Personn(String name, int age, Genderr gender, String futureName, Genderr futureGender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.futureName = futureName;
        this.futureGender = futureGender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Genderr getGender() {
        return gender;
    }

    public void setGender(Genderr gender) {
        this.gender = gender;
    }

    public String getFutureName() {
        return futureName;
    }

    public void setFutureName(String futureName) {
        this.futureName = futureName;
    }

    public Genderr getFutureGender() {
        return futureGender;
    }

    public void setFutureGender(Genderr futureGender) {
        this.futureGender = futureGender;
    }
}
