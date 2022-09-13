package sessions.polymorphism.tapshyrma2;

public class Dancer {

    private String name;
    private int age;

    public Dancer(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void dance(){
        System.out.println("I am dancer and I can dance");
    }


    public int getAge() {
        return age;
    }

    public String getName(){
        return name;
    }
}
