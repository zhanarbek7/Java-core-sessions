package abstracts.tapshyram2;

public class King extends ChessItem{
    public King(int x, int y, String color) {
        super(x, y,999, color);
    }

    @Override
    public void draw() {
        super.draw();
    }

    @Override
    public void action() {
        System.out.println("Бир кадам каалагандай журот!");
    }
}
