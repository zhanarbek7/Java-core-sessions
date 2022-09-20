package sessions.abstracts17.tapshyram1;

public class Main {
    public static void main(String[] args) {
        Car car = new Sedan("Mercedes Benz","black","320 km/h");
        Sedan sedan1 = new Sedan("Mercedes Benz","white","220 km/h");
        Sedan sedan2 = new Sedan("BMW","black","330 km/h");
        Minivan minivan = new Minivan("Honda Odyssey", "white","180 km/h");

        System.out.println("Car-1");
        System.out.println(car.getColor());
        System.out.println(car.getModel());
        System.out.println(car.getMaxSpeed());
        car.gas();
        car.brake();

        System.out.println("\nSedan-1");
        System.out.println(sedan1.getColor());
        System.out.println(sedan1.getModel());
        System.out.println(sedan1.getMaxSpeed());
        sedan1.gas();
        sedan1.brake();
        sedan1.sedan();
    }
}
