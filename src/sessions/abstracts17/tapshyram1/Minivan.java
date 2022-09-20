package sessions.abstracts17.tapshyram1;

public class Minivan extends Car{
    public Minivan(String model, String color, String maxSpeed) {
        super(model, color, maxSpeed);
    }

    @Override
    public void gas() {
        System.out.println("Minivan makes gas!");
    }

    @Override
    public void brake() {
        System.out.println("Minivan makes brake!");
    }

    public void minivan(){
        System.out.println("I am minivan!");
    }
}
