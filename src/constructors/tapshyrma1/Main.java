package constructors.tapshyrma1;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(5,7);
        Rectangle rectangle2 = new Rectangle(12,6);
        Rectangle rectangle3 = new Rectangle(3,5);

        System.out.printf("Rectangle1: a = %d, b = %d\n",rectangle1.getA(),rectangle1.getB());
        System.out.printf("Rectangle2: a = %d, b = %d\n",rectangle2.getA(),rectangle2.getB());
        System.out.printf("Rectangle3: a = %d, b = %d",rectangle3.getA(),rectangle3.getB());
    }
}
