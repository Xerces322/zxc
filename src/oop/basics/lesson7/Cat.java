package oop.basics.lesson7;

import java.util.Arrays;

public class Cat {
    private String color;
    private double weight;
    private String ownerName;

    public Cat(String _color, double _weight, String _ownerName) {
        this.color = _color;
        this.weight = _weight;
        this.ownerName = _ownerName;
    }

    public void destroySofa(String sofaOwner) {
        System.out.printf("Кот дерет диван %s\n", sofaOwner);
    }

    public String catHunt(boolean isDay) {
        if (isDay)
            return "Мышь";
        return "Сова";
    }

    public void feed(String giver, String ...product) {
        System.out.printf("Человек %s дает еду. Кот поел: %s", giver, Arrays.toString(product));
    }
    public String catHunt(boolean isDay, boolean success) {
        if (success){
            if (isDay)
                return "Мышь";
            return "Сова";
        }
        return "Добычи нет";
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}
