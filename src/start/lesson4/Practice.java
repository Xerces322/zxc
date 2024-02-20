package start.lesson4;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner qwe = new Scanner(System.in);
        boolean isWorkEngine = qwe.nextBoolean();
        boolean isWorkTransmission = qwe.nextBoolean();
        boolean isFineWheel1 = qwe.nextBoolean();
        boolean isFineWheel2 = qwe.nextBoolean();
        boolean isFineWheel3 = qwe.nextBoolean();
        boolean isFineWheel4 = qwe.nextBoolean();
        boolean isFineWheel = isFineWheel1 && isFineWheel2 && isFineWheel3;
        boolean engine = isWorkEngine && isWorkTransmission && isFineWheel;
        if (engine)
            System.out.println("Машина готова к эксплуатации");
        else
            System.out.println("Машине сломана");
    }
}
