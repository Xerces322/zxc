package start.lesson4;

public class Scope {
    public static void main(String[] args) {
        double priceCar = 10_000;
        if (priceCar > 9_000)
            priceCar *= 0.95;
        System.out.println(priceCar);
    }
}
