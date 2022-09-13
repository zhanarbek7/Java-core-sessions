package sessions.abstracts.tapshyram2;

public class Bishop extends ChessItem{
    public Bishop(int x, int y, String color) {
        super(x, y,3, color);
    }

    @Override
    public void draw() {
        super.draw();
    }

    @Override
    public void action() {
        System.out.println("Слон диагональга чексиз журот!");
    }
}
