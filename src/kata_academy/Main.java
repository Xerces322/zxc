package kata_academy;

public class Main {
    static String[] roman = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
    static int[] arabic = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
    public static String toRoman(int num) {
        StringBuilder res = new StringBuilder();
        for (int i = arabic.length - 1; i >= 0; i--) {
            while (num >= arabic[i]) {
                res.append(roman[i]);
                num -= arabic[i];
            }
        }
        return String.valueOf(res);
    }
    public static int toArabic(String str) {
        String[] str1 = str.split("");
        StringBuilder pre = new StringBuilder();
        int res = 0;
        for (int i = str1.length-1; i >= 0; i--) {
            for (int j = 0; j < roman.length; j++) {
                if (str1[i].equals(roman[j])){
                    if (j + 2 < roman.length && pre.toString().contains(roman[j+2])) {
                        res -= arabic[j];
                    }
                    else if (j + 4 < roman.length && pre.toString().contains(roman[j+4])) {
                        res -= arabic[j];
                    }
                    else{
                        pre.append(roman[j]);
                        res += arabic[j];
                    }
                }
            }
        }
        return res;
    }
    public static String calc(String input) throws Exception {
        if (input.length() < 5)
            throw new Exception("Строка не является математичкесой операцией");
        if (input.contains("\n"))
            throw new Exception("Неправильный ввод");
        int result = 0;
        int num1;
        int num2;
        String[] mass = input.split(" \\W ");
        String number1 = mass[0];
        String number2 = mass[1];
        if (mass.length > 2)
            throw new Exception("формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        String sign = input.replaceAll("\\w|\\s", "");

        boolean arabic = false;

        boolean qwe = (number1.matches("\\d{1,2}") && number2.matches("\\d{1,2}")) ||
                (number1.matches("[a-zA-Z]{1,3}") && number2.matches("[a-zA-Z]{1,3}"));
        if (!qwe) {
            throw new Exception("используются одновременно разные системы счисления");
        }
        if (number1.matches("\\d{1,2}")) {
            arabic = true;
            num1 = Integer.parseInt(number1);
            num2 = Integer.parseInt(number2);
        }
        else {
            num1 = toArabic(number1);
            num2 = toArabic(number2);
        }
        if (num1 > 10 || num1 < 1 || num2 > 10 || num2 < 1)
            throw new Exception("числа должны быть не менее 1 и не более 10");
        switch (sign) {
            case "+" -> result = num1 + num2;
            case "-" -> result = num1 - num2;
            case "*" -> result = num1 * num2;
            case "/" -> result = num1 / num2;
        }
        if (!arabic) {
            if (result < 0)
                throw new Exception("в римской системе нет отрицательных чисел");
            else if (result > 0)
                return toRoman(result);
        }
        return String.valueOf(result);
    }

    public static void main(String[] args) throws Exception {
        System.out.println(calc("1 + 2 + 3"));
    }
}
