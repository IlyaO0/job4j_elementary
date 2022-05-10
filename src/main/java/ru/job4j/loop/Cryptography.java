package ru.job4j.loop;

public class Cryptography {
    public static String code(String s) {
        StringBuilder str = new StringBuilder(s);
        int length = s.length();
        if (length > 4) {
            for (int index = 0; index < length - 4; index++) {
                str.setCharAt(index, '#');
                s = str.substring(0, length);
            }
        } else if (length == 0) {
            s = "empty";
        } else {
            return s;
        }
        return s;
    }
}