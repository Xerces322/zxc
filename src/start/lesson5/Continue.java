package start.lesson5;

public class Continue {
    public static void main(String[] args) {
        int[] zxc = {3, 5, 6, 2, 1};
        for (int i : zxc) {
            if (i == 6)
                continue;
            else
                System.out.println("Отжимается");
        }
    }
}
