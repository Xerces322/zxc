package start.lesson6;

public class TextBlock {
    public static void main(String[] args) {
        //String text = "Привет как тебя зовут?\n" + "Меня зовут Никита. А тебя?\n" + "Меня зовут Чорт!";
        String name1 = "Никита";
        String name2 = "Чорт";
        String text =
                """
                Привет, как тебя зовут?
                Меня зовут %s. А тебя?
                Меня зовут %s!
                """.formatted(name1, name2);
        System.out.println(text);
    }
}
