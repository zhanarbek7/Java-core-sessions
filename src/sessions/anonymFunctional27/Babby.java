package sessions.anonymFunctional27;

public class Babby {
    private String name;
    private int age;
    private Genderr gender;

    public Babby(String name, int age, Genderr gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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
}
