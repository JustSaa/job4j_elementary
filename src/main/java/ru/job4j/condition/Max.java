package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    public static int max(int left, int right, int middle) {
        return max(left, max(middle, right));
    }

    public static int max(int a, int b, int c, int d) {
        return max(max(a, b), max(c, d));
    }
}