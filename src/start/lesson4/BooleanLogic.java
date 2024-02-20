package start.lesson4;

import java.util.Scanner;

public class BooleanLogic {
    public static void main(String[] args) {
        Scanner qwe = new Scanner(System.in);
//        //kupi hleb
//        boolean isBoughtBread = qwe.nextBoolean();
//        //kupi moloko
//        boolean isBoughtMilk = qwe.nextBoolean();



//
//        boolean isBoughtBreadMilk = isBoughtMilk || isBoughtBread;
//        //System.out.println(isBoughtBreadMilk);


        boolean isBoughtCandy = qwe.nextBoolean();
        if (!isBoughtCandy)
            System.out.println("good");
    }
}
