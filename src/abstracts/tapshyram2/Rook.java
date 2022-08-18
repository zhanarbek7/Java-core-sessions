package abstracts.tapshyram2;

public class Rook extends ChessItem{
    public Rook(int x, int y, String color) {
        super(x, y,5, color);
    }

    @Override
    public void draw() {
        super.draw();
    }

    @Override
    public void action() {
        System.out.println("Ладья туз чексиз журот!");
    }
}
