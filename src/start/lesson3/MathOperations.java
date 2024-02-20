package start.lesson3;

public class MathOperations {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        int sum = x + 5;
        //System.out.println(sum);

        int diff = x - 5;
        //System.out.println(diff);

        int multiply = x * y;
        //System.out.println(multiply);

        y = 3;
        double divide = (double) x / y;
        //System.out.println(divide);

        int ext = x * x;
        //System.out.println(ext);

        //Инкремент
        x++;

        //Сокращенная форма записи
        x += 10;
        //System.out.println(x);

        //Декримент
        x--;
        //System.out.println(x);

        int number = 4;
        int modulo = number % 2;


        double height = 1.82;
        int weight = 61;
        double index = weight / (height * height);
        //System.out.println(index);

        //Char - символ, 16 bit
        char letter = 'Я' + 1;
        //System.out.println(letter);

        char newLine = '\n';
        char tab = '\t';
        char escape = '\\';
        System.out.println(newLine);


    }
}
