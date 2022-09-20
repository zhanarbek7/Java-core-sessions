package sessions.polymorphism16.tapshyrma2;

public class BreakDancer extends Dancer{
    public BreakDancer(String name, int age) {
        super(name, age);
    }

    @Override
    public void dance() {
        System.out.println("I am break dancer and I can dance breakdance");
    }
}
