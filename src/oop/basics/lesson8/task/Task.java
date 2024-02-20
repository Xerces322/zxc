package oop.basics.lesson8.task;

public class Task {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Restaurant rest1 = new Restaurant();
        Restaurant rest2 = new Restaurant();
        rest1.cookHotDog();
        Restaurant.addProducts();
        rest2.cookHotDog();
//        Field field = rest1.getClass().getDeclaredField("sausages");
//        field.setAccessible(true);
//        field.set(rest1, 333);
//        System.out.println(field.get(rest1));
    }
}
