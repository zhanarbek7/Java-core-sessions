package zInnerClasses.anynomous;

public class Main {
    public static void main(String[] args) {
    }
}
interface Polygon {
    void display();
}

class AnonymousDemo {
    public void createClass() {

        // anonymous class implementing interface
        Polygon p1 = new Polygon() {
            public void display() {
                System.out.println("Inside an anonymous class.");
            }
        };
        p1.display();
    }
}

