package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollar = Converter.rubleToDollar(180);
        System.out.println("180 rubles are " + dollar + " dollar.");
        float eur = 140;
        float expeur = 2;
        float outeur = Converter.rubleToEuro(eur);
        boolean passeur = expeur == outeur;
        System.out.println("140 rubles are 2 EUR. Test result : " + passeur);
        float usd = 180;
        float expusd = 3;
        float outusd = Converter.rubleToDollar(usd);
        boolean passusd = expusd == outusd;
        System.out.println("180 rubles are 3 USD. Test result : " + passusd);

    }
}
