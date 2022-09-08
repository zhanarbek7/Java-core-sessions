package zInnerClasses.car;

public class Car {
    private String carName;
    private String carType;

    public Car(String carName, String carType) {
        this.carName = carName;
        this.carType = carType;
    }

    public String getCarName() {
        return carName;
    }

    public String getCarType() {
        return carType;
    }

    class Engine{
        String engineType;

        public void setEngineType(){
            if(Car.this.carType.equals("4WD")){
                if(Car.this.getCarName().equals("Chrysler")){
                    this.engineType = "Smaller";
                }
                else{
                    this.engineType = "Bigger";
                }
            }
            else{
                this.engineType = "Bigger";
            }
        }

        public String getEngineType() {
            return engineType;
        }
    }
}
