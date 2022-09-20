package sessions.anonymFunctional27.anonymclassGood;

public class Example2ExtendsClass {
    public static void main(String[] args) {
        // anonymous class extending class Polygon
        PolygonClass polygon = new PolygonClass(){
            @Override
            public void display() {
                System.out.println("Inside an anonymous class!");
            }
        };
        polygon.display();
    }

}
class PolygonClass {
    public void display(){
        System.out.println("Inside the Polygon class");
    }
}


