package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] postfix) {
        boolean result = true;
        int wordLength = word.length;
        int postfixLength = postfix.length;
        for (int i = 0; i < postfixLength; i++) {
            if (word[wordLength - postfixLength + i] != postfix[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}