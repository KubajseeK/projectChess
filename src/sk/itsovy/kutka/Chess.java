package sk.itsovy.kutka;

public class Chess {

    public String normalize(String item) {
        if (item == null || item.length() != 2) {
            return null;
        }

        item = item.toUpperCase();

        if (Character.isDigit(item.charAt(0)) && Character.isLetter(item.charAt(1))) {
            item = item.charAt(1) + String.valueOf(item.charAt(0));
        }

        if (item.charAt(0) < 65 || item.charAt(0) > 72) {
            return null;
        }

        if (item.charAt(1) < 49 || item.charAt(1) > 56) {
            return null;
        }

        return item;
    }

    public boolean checkKing(String pos, String des) {
        pos = normalize(pos);
        des = normalize(des);

        if (pos == null || des == null) {
            return false;
        }

        if (pos.equals(des)) {
            return false;
        }


        return Math.abs(pos.charAt(0) - des.charAt(0)) <= Math.abs(1) && Math.abs(pos.charAt(1) - des.charAt(1)) <= Math.abs(1);
    }

    public boolean checkQueen(String pos, String des) {
        pos = normalize(pos);
        des = normalize(des);

        if (pos == null || des == null) {
            return false;
        }

        if (pos.equals(des)){
            return false;
        }

        return (Math.abs(pos.charAt(0) - des.charAt(0)) == Math.abs(pos.charAt(1) - des.charAt(1))
                || (pos.charAt(0) == des.charAt(0) || pos.charAt(1) == des.charAt(1)));
    }

    public boolean checkBishop(String pos, String des) {

        pos = normalize(pos);
        des = normalize(des);

        if (pos == null || des == null) {
            return false;
        }

        if (pos.equals(des)) {
            return false;
        }

        return Math.abs(pos.charAt(0) - des.charAt(0)) == Math.abs(pos.charAt(1) - des.charAt(1));
    }

    public boolean checkRook(String pos, String des) {
        pos = normalize(pos);
        des = normalize(des);

        if (pos == null || des == null) {
            return false;
        }

        if (pos.equals(des)){
            return false;
        }

        return pos.charAt(0) == des.charAt(0) || pos.charAt(1) == des.charAt(1);
    }

    public boolean checkKnight(String pos, String des) {
        pos = normalize(pos);
        des = normalize(des);

        if (pos == null || des == null) {
            return false;
        }

        if (pos.equals(des)) {
            return false;
        }

        int posX = Math.abs(pos.charAt(0) - des.charAt(0));
        int posY = Math.abs(pos.charAt(1) - des.charAt(1));
        return (posX == 1 && posY == 2) || (posX == 2 && posY == 1);
    }
}
