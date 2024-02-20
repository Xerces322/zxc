package start.lesson6;

public class StringPractice {
    public static void main(String[] args) {
        String[] JoJo = "My name is Giorgio Giovanni".substring(11).toLowerCase().split(" ");
        for (String j : JoJo) {
            System.out.print(j + " ");
            System.out.println(j.length());
        }
    }
}
