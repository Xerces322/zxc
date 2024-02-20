package oop.class_object;

public class Cat extends Object{
    private String catName;

    public Cat(String _catName) {
        this.catName = _catName;
    }

    @Override
    public String toString() {
        return catName;
    }
}
