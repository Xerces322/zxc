package oop.class_object.equals_and_hashcode_practice;

public class Task {
    public static void main(String[] args) {
        User xerces = new User("Xerces", 123123);
        User xerces1 = new User("Xerces", 321321);
        System.out.println(xerces.hashCode());
        System.out.println(xerces1.hashCode());
        System.out.println(xerces.equals(xerces1));

    }
}
