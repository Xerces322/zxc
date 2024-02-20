package oop.inheritance.lesson9.task;

public class SecurityGuard extends Professions{
    @Override
    public void getSalary() {
        System.out.println("Охранник получил зарплату в размере - " + super.salary);
    }

    public SecurityGuard(String _gender) {
        super.gender = _gender;
        WorkersCount++;
        super.skill = "Сторожить";
        super.salary = 15_000;
    }



}
