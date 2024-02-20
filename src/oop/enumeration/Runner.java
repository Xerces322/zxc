package oop.enumeration;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(CountryGuide.values()));
        System.out.println(CountryGuide.valueOf("ARGENTINA").getPopulation());
    }
}
