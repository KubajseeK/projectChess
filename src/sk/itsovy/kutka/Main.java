package sk.itsovy.kutka;

public class Main {

    public static void main(String[] args) {
	Chess chess = new Chess();

        System.out.println(chess.normalize("3D"));
        System.out.println("King from F5 to F6");
        System.out.println(chess.checkKing("5F", "6F"));
        System.out.println("Queen from D4 to D8");
        System.out.println(chess.checkQueen("4D", "8D"));
        System.out.println("Bishop from D5 to H1");
        System.out.println(chess.checkBishop("5D", "1H"));
        System.out.println("Knight from D4 to C6");
        System.out.println(chess.checkKnight("4D", "6C"));
        System.out.println("Rook from D5 to G5");
        System.out.println(chess.checkRook("5D", "5G"));
    }
}
