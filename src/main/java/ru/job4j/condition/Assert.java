package ru.job4j.condition;

public class Assert {

    public static void znac(int a, int b, int c) {
        if (a > b) {
            if (a > c) {
                System.out.println("a");
            } else {
                System.out.println("c");
            }
        } else {
            if (b < c) {
                System.out.println("c");
            } else {
                System.out.println("b");
            }
        }
    }

    public static void main(String[] args) {
        Assert.znac(1, 2, 1);
    }
}
