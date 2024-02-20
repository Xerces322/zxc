package start.lesson6;

public class StringFormat {
    public static void main(String[] args) {
        String name = "Nikita";
        int age = 18;
        //String phrase = "Меня зовут " + name + ". Мне " + age + " лет.";
        //String phrase = String.format("Меня зовут %s. Мне %d лет.", name, age);
        System.out.printf("Меня зовут %s. Мне %d лет.", name, age);
    }
}
