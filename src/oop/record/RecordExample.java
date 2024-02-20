package oop.record;

public class RecordExample {
    public static void main(String[] args) {
        Human human = new Human(2005, "Nikita", "Sergeyevich", "Prudnikov");
        System.out.println(human);
        HumanRecord humanRecord = new HumanRecord(2005, "Nikita", "Sergeyevich", "Prudnikov");
        System.out.println(humanRecord);
        System.out.println(humanRecord.surname());
    }
}
