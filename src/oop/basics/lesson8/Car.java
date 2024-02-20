package oop.basics.lesson8;

import java.util.Arrays;

public class Car {
    private String brand;
    public static int counter;
    public final static String BMW_INFO = "Bmw - немецкая компания, основанная в 1928 году.";
    public final static String AUDI_INFO = "Audi - немецкая компания, основанная в 1933 году.";
    public final static String TOYOTA_INFO = "Toyota - немецкая компания, основанная в 1937 году.";
    public final static String[] BRANDS_DESCRIPTIONS = new String[3];
    static {
        BRANDS_DESCRIPTIONS[0] = BMW_INFO;
        BRANDS_DESCRIPTIONS[1] = AUDI_INFO;
        BRANDS_DESCRIPTIONS[2] = TOYOTA_INFO;
        System.out.println(Arrays.toString(Car.BRANDS_DESCRIPTIONS));
    }

    public Car(String brand) {
        this.brand = brand;
        counter++;
    }
    public static void printBrands() {
        System.out.println(
                """
                В наличии:
                Мерседес, Ауди, Бмв, Таеота, Фольксваген.\n
                """);
    }
}
