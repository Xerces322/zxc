package start.lesson4;

public class Ternary {
    public static void main(String[] args) {
        int money = 100;
        int ownMoney = 0;
        int breadPrice = 51;
        ownMoney += money-breadPrice >= 50 ? 10 : 5;
        System.out.println(ownMoney);
    }
}
