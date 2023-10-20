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

        float dollar = rubleToDollar(140);
        System.out.println("140 rubles are " + dollar + " dollar.");

        float in = 140;
        float expectedEuro = 2;
        float outEuro = Converter.rubleToEuro(in);
        boolean passedEuro = outEuro == expectedEuro;
        System.out.println("140 rubles are 2 Euro. Test result : " + passedEuro);

        float expectedDollar = 2.3333333F;
        float outDollar = Converter.rubleToDollar(in);
        boolean passedDollar = outDollar == expectedDollar;
        System.out.println("140 rubles are 2 Dollar. Test result : " + passedDollar);
    }
}
