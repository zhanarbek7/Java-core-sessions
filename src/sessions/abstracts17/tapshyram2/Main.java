package sessions.abstracts17.tapshyram2;

public class Main {
    public static void main(String[] args) {
        Pawn pawn1 = new Pawn(2,1, "white");
        Pawn pawn2 = new Pawn(2,8, "white");
        Bishop bishop1 = new Bishop(1,3, "white");
        Bishop bishop2 = new Bishop(1, 6, "white");
        Knight knight1 = new Knight(1,2,"white");
        Knight knight2 = new Knight(1,7,"white");
        Rook rook1 = new Rook(1,1, "white");
        Rook rook2 = new Rook(1,8, "white");
        Queen queen1 = new Queen(1,5,"white");
        King king1 = new King(1,4,"white");

        Pawn pawn3 = new Pawn(7,1, "black");
        Pawn pawn4 = new Pawn(7,8, "black");
        Bishop bishop3 = new Bishop(8,2, "black");
        Bishop bishop4 = new Bishop(8, 7, "black");
        Knight knight3 = new Knight(8,2,"black");
        Knight knight4 = new Knight(8,7,"black");
        Rook rook3 = new Rook(8,1, "black");
        Rook rook4 = new Rook(8,8, "black");
        Queen queen2 = new Queen(8,4,"black");
        King king2 = new King(8,5,"black");

        ChessItem[] chessItems =
                {pawn1, pawn2, bishop1, bishop2, knight1, knight2, rook1, rook2, queen1, king1,
                pawn3, pawn4, bishop3, bishop4, knight3, knight4, rook3, rook4, queen2, king2};


    }

    public static void printBlack(ChessItem[] chessItems){
        for (ChessItem i: chessItems) {
            if(i.getColor().equals("black")){
                i.draw();
                System.out.println("--------------------------------");
            }
        }
    }

    public static void method2(ChessItem[] chessItems){
        for(ChessItem i: chessItems){
            if(!(i instanceof King)){
                i.draw();
                System.out.println("--------------------------------");
            }
        }
    }

    public static void method3(ChessItem[] chessItems){
        for (ChessItem i: chessItems){
            if(i.getX()==2){
                i.draw();
                System.out.println("--------------------------------");
        }
        }
    }

    public static void printPawns(ChessItem[] chessItems){
        for (ChessItem i: chessItems){
            if(i instanceof Pawn){
                i.draw();
                System.out.println("--------------------------------");
            }
        }
    }

    public static void printAction(ChessItem[] chessItems){
        for (ChessItem i: chessItems){
            System.out.println(i.getClass().getSimpleName());
            i.action();
            System.out.println(i.getColor());
            System.out.println("--------------------------------");
        }
    }

}
