package start.lesson4;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner qwe = new Scanner(System.in);
        int numberDay = qwe.nextInt();
        switch (numberDay)
        {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("????????????????????");
        }
    }
}
