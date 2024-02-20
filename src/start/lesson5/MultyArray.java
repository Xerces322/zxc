package start.lesson5;

public class MultyArray {
    public static void main(String[] args) {
        int[] zxc1 = {180, 178, 190};
        int[] zxc2 = {165, 195, 193};
        int[][] zxc = {zxc1, zxc2};
        qwe:
        for (int[] zx : zxc) {
            for (int z : zx) {
                if (z == 178){
                    System.out.println("Нашли вора");
                    break qwe;
                }
                else
                    System.out.println("Не тот");
            }
        }
    }
}
