package sessions.polymorphism.taspshyrma3;

public class Person {
    private String name;
    private int age;

    public void iAmAble(){
        System.out.println("I am a person and I am able to walk!");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
