package sessions.abstracts.tapshyram1;

public class Sedan extends Car{
    public Sedan(String model, String color, String maxSpeed) {
        super(model, color, maxSpeed);
    }

    @Override
    public void gas() {
        System.out.println("Sedan makes gas!");
    }

    @Override
    public void brake() {
        System.out.println("Sedan makes brake!");
    }

    public void sedan(){
        System.out.println("I am Sedan!");
    }
}
