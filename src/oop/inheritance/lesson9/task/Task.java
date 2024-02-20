package oop.inheritance.lesson9.task;

public class Task {
    public static void main(String[] args) {
        Booker booker = new Booker("Wooman");
        SecurityGuard securityGuard = new SecurityGuard("man");
        Clerk clerk = new Clerk("Woman");

        System.out.println(Professions.WorkersCount);

        booker.drinkCoffee();
        booker.getSalary();

        securityGuard.getSalary();

        clerk.drinkCoffee();
        clerk.getSalary();
    }
}
