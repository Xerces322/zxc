package oop.inheritance.lesson9.task;

public class Clerk extends OfficeProfession{
    @Override
    public void getSalary() {
        System.out.println("Серетарь получил зарплату в размере - " + super.salary);
    }
    public Clerk(String _gender) {
        super.gender = _gender;
        WorkersCount++;
        super.skill = "Печатать докумменты";
        super.salary = 30_000;
    }
    @Override
    public void drinkCoffee() {
        System.out.println("Секретарь пьет кофе");
    }
}
