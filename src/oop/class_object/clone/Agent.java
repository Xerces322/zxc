package oop.class_object.clone;

public class Agent implements Cloneable{
    private String name;

    @Override
    public String toString() {
        return "Agent{" +
                "name='" + name + '\'' +
                '}';
    }

    public Agent(String _name) {
        this.name = _name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
