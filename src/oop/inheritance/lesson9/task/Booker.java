package oop.inheritance.lesson9.task;

public class Booker extends OfficeProfession{
    @Override
    public void getSalary() {
        System.out.println("Бухгалтер получил зарплату в размере - " + super.salary);
    }
    public Booker(String _gender) {
        super.gender = _gender;
        WorkersCount++;
        super.skill = "Считать налоги";
        super.salary = 50_000;
    }
    @Override
    public void drinkCoffee() {
        System.out.println("Бухгалтер пьет кофе");
    }
}
