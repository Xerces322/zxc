package oop.class_object.hashcode;

import oop.class_object.equals.Child;

public class HashcodeExample {
    public static void main(String[] args) {
        Child child1 = new Child("Nikita", 18);
        Child child2 = new Child("Rostik", 19);
        Child child3 = new Child("Phill", 21);
        Child child4 = new Child("Fedya", 18);


        Child[] group0 = {child1, child4};
        Child[] group1 = {child2, child3};

        Child childForFInd = new Child("Nikita", 18);


        ChidrenGardenWithGroups chidrenGardenWithGroups = new ChidrenGardenWithGroups(new Child[][]{group0, group1});
        boolean res = false;
        for (Child child : chidrenGardenWithGroups.getChildren()[childForFInd.hashCode()]) {
            if (childForFInd.equals(child)) {
                res = true;
                break;
            }
        }

    }

}
