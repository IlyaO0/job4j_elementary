package ru.job4j.condition;

public class DivideBySix {
    public static String checkNumber(int number) {
        String rsl;
        if (number % 3 == 0 && number % 2 == 0) {
            rsl = "Iskhodnoe chislo delitsya na 6.";
        } else if (number % 3 == 0) {
            rsl = "Iskhodnoe chislo delitsya na 3, no ne yavlyaetsya chetnym.";
        } else if (number % 2 == 0) {
            rsl = "Iskhodnoe chislo ne delitsya na 3, no yavlyaetsya chetnym";
        } else {
            rsl = "Iskhodnoe chislo ne delitsya na 3 i ne yavlyaetsya chetnym.";
        }
        return rsl;
    }
}
