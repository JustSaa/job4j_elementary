package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    public static int max(short left, short right) {
        int result = left > right ? left : right;
        return result;
    }

    public static int max(int left, short right) {
        int result = left > right ? left : right;
        return result;
    }

    public static int max(int left, int right, int middle) {
        int result = left > right ? left : right;
        return result > middle ? result : middle;
    }

    public static int max(int a, int b, int c, int d) {
        int result = a > b ? a : b;
        result = result > c ? result : c;
        result = result > d ? result : d;
        return result;
    }
}