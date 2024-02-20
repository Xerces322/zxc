package start.lesson5;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int qwe = 123;
        int asd = 321;
        int[] zxc = {qwe, asd};
        //System.out.println(Arrays.toString(zxc));
        //int[] zxc1 = zxc;
        //zxc1[0] = 444;// т.к zxc1 это ссылка на zxc,то zxc[0] будет равна 444
        int[] zxc1 = {qwe, asd};
        zxc1[0] = 444;
        System.out.println(Arrays.toString(zxc));
        System.out.println(Arrays.toString(zxc1));
    }
}
