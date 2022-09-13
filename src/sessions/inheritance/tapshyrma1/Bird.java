package sessions.inheritance.tapshyrma1;

public class Bird extends Animal{

    public void bird(){
        System.out.println("I am bird and I can fly");
        System.out.println(super.res);
        super.animal();
    }

}
