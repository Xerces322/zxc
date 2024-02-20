package oop.class_object.equals;

public class Example {
    public static void main(String[] args) {
        Child child1 = new Child("Nikita", 18);
        Child child2 = new Child("Rostik", 19);
        ChildrenGarden childrenGarden = new ChildrenGarden(new Child[]{child1, child2});
        boolean result = false;
        Child childForFind = new Child("Nikita", 18);
        for (Child child : childrenGarden.getChildren()) {
            if (child.equals(childForFind)) {
                result = true;
                break;
            }
        }
        System.out.println(result);
    }
}
