package oop.basics.lesson8.task;

public class Restaurant {
    private static int sausagesCount;
    private static int breadCount;

    public void cookHotDog() {
        if (sausagesCount > 0 && breadCount > 1) {
            sausagesCount--;
            breadCount -= 2;
            System.out.println("Хот-дог готов!");
        }
        else System.out.println("Нет ингридиентов!");
    }
    public static void addProducts() {
        sausagesCount += 100;
        breadCount += 200;
        System.out.println("На склад доставлено 100 сосисок и 200 кусков хлеба");
    }
}
