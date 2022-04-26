package ru.job4j.calculator;

public class Fit {
        public static double manWeight(short height) {
            double rsl = (height - 100) * 1.15;
            return rsl;
        }

        public static double womanWeight(short height) {
            double rsl = (height - 110) * 1.15;
            return rsl;
        }

        public static void main(String[] args) {
            short height = 184;
            double man = Fit.manWeight(height);
            System.out.println("Man 184 is " + man);
            short wheight = 162;
            double woman = Fit.womanWeight(wheight);
            System.out.println("Woman 162 is " + woman);
        }
}
