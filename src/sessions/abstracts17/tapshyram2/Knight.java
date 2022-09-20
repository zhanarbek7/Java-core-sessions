package sessions.abstracts17.tapshyram2;

public class Knight extends ChessItem{
    public Knight(int x, int y, String color) {
        super(x, y,3, color);
    }

    @Override
    public void draw() {
        super.draw();
    }

    @Override
    public void action() {
        System.out.println("Г тамгасы менен журот!");
    }
}
