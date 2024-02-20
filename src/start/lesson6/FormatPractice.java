package start.lesson6;

public class FormatPractice {
    public static void main(String[] args) {
        String carMark = "Toyota";
        String carModel = "AE86";
        double priceCar = 320_000.00;
        boolean hasAutomaticTransmission = true;
        System.out.printf("Привет я менеджер салона %s\nУ нас есть модель %s за %f\n" +
                "Есть ли у нее автоматическая коробка передач?\n%s", carMark, carModel, priceCar,
                hasAutomaticTransmission ? "Да" : "Нет");
    }
}
