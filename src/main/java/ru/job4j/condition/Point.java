package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl1 = x2 - x1;
        double rsl2 = y2 - y1;
        double first = Math.pow(rsl1, 2);
        double second = Math.pow(rsl2, 2);
        double sum = first + second;
        double rsl = Math.sqrt(sum);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(5, 2, 9, 2);
        System.out.println("result (5, 2) to (9, 2) " + result);
    }
}
