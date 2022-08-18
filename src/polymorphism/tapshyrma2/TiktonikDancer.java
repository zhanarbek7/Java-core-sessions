package polymorphism.tapshyrma2;

public class TiktonikDancer extends Dancer {
    public TiktonikDancer(String name, int age) {
        super(name, age);
    }

    @Override
    public void dance() {
        System.out.println("I am tiktonik dancer and I can dance tiktonik");
    }
}
