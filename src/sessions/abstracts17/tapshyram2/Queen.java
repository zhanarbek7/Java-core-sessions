package sessions.abstracts17.tapshyram2;

public class Queen extends ChessItem{
    public Queen(int x, int y, String color) {
        super(x, y,9, color);
    }

    @Override
    public void draw() {
        super.draw();
    }

    @Override
    public void action() {
        System.out.println("Ферзь г'дан башка жолдор менен чексиз журот!");
    }
}
