package util;

public class CurrencyConverter {
    public static final double DOLLAR = 3.10;
    public static final double TAXES = 0.06;

    public static double converter(double ammountOfDollars) {
        return (DOLLAR * ammountOfDollars) + (DOLLAR * ammountOfDollars * TAXES);
    }
}
