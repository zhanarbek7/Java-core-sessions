package abstracts.tapshyram1;

public abstract class Car {
    private String model, color, maxSpeed;

    public Car(String model, String color, String maxSpeed){
        this.color = color;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public abstract void gas();

    public abstract void brake();

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getMaxSpeed() {
        return maxSpeed;
    }
}
