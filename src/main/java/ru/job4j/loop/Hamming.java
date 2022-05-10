package ru.job4j.loop;

public class Hamming {
    public static int checkStrings(String left, String right) {
        int ham = 0;
        String sequenceX = left.toLowerCase();
        String sequenceY = right.toLowerCase();
        for (int index = 0; index < sequenceX.length(); index++) {
            if (sequenceX.charAt(index) != sequenceY.charAt(index)) {
                ham++;
            }
        }
        return ham;
    }
}