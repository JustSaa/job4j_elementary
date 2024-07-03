package ru.job4j.condition;

public class ChessBoard {

    public static int way(int x1, int y1, int x2, int y2) {
        return (!isValid(x1) || !isValid(x2) || !isValid(y1) || !isValid(y2)) ? 0
                : (Math.abs(x2 - x1) == Math.abs(y2 - y1) ? Math.abs(x2 - x1) : 0);
    }

    private static boolean isValid(int coordinate) {
        return coordinate >= 0 && coordinate <= 7;
    }
}