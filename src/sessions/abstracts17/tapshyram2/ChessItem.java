package sessions.abstracts17.tapshyram2;

public abstract class ChessItem {

    private int x, y, value;
    private String color;

    public ChessItem(int x, int y, int value, String color) {
        this.x = x;
        this.y = y;
        this.value = value;
        this.color = color;
    }

    public void draw(){
        System.out.println(getClass().getSimpleName());
        System.out.println("x = "+getX());
        System.out.println("y = "+getY());
        System.out.println("value = "+getValue());
        System.out.println("color = "+getColor());
    }
    public abstract void action();

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getValue() {
        return value;
    }

    public String getColor() {
        return color;
    }
}
