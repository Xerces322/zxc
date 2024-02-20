package oop.basics.lesson7;

public class Dog {
    private String name = "Lord";
    private int weight = 40;
    private String owner = "Volendemort";
    {
        System.out.println("Собака создалась");
    }

    public Dog() {}
    public Dog(String name, int weight, String owner) {
        if (weight < 1)
            this.weight = 5;
        else this.weight = weight;
        this.name = name;
        this.owner = owner;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        if (weight < 1)
            this.weight = 5;
        else this.weight = weight;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getOwner() {
        return "Mr." + owner;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", owner='" + owner + '\'' +
                '}';
    }
}
