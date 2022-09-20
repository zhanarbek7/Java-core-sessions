package sessions.anonymFunctional27.anonymclassGood;

public class Example3ImplInterface {
    public static void main(String[] args) {
        // anonymous class implementing interface
        PolygonInterface polygon = new PolygonInterface() {
            @Override
            public void display() {
                System.out.println("This is display of Polygon Interface");
            }
        };
    }
}

interface PolygonInterface {
    void display();
}

