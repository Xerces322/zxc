package start.lesson6;

public class StringMethod {
    public static void main(String[] args) {
        String text = "Hello world!";
        //Перевод в верхний регистр
        String UpperText = text.toUpperCase();

        //Перевод в нижний регистр
        String LowerText = text.toLowerCase();

        //Длина строки
        int length = text.length();

        //Есть ли в тексте другой текст
        boolean containText = text.contains("Hello");


        //Замена заданного теста на другой текст
        String changeText = text.replaceAll("Hello", "By");


        //Повтор текста n раз
        String repeatText = text.repeat(3);


        //Разбить текст на массив String
        String[] splitText = "qwe0asd0zxc".split("0");
        //System.out.println(Arrays.toString(splitText));

        //Объединение строк(Конкатенация)
        String concatenationText = String.join(".", new String[]{"qwe", "asd", "zxc"});
        System.out.println(concatenationText);

        //Провверка на начало строки
        boolean startText = text.startsWith("Hel");
        //System.out.println(startText);

        //Проверка на окончание строки
        boolean endsText = text.endsWith("!");
        //System.out.println(endsText);

        //Вырезать подстроку из строки
        String cutText = text.substring(0, 5);
        System.out.println(cutText);
    }
}
