package zInnerClasses.car;


public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda", "8WD");

        Car.Engine engine = car1.new Engine();
        engine.setEngineType();
        System.out.println("Engine type for 8WD = " + engine.getEngineType());

        Car car2 = new Car("Chrysler", "4WD");
        Car.Engine c2engine = car2.new Engine();
        c2engine.setEngineType();
        System.out.println("Engine Type for 4Wd = "+ c2engine.getEngineType());
    }
}
