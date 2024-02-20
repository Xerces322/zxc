package oop.exceptions;

public class ExceptionExample {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        try {
            int[] qwe = new int[2];
            System.out.println(qwe[3]);
        } catch (ArithmeticException e) {
            System.out.println("\u001B[31m" + "ой произошла ошибка, связанная с делением: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\u001B[31m" + "ой произошла ошибка, связанная с выходом за пределы массива" + e.getMessage());
        }
    }
}
