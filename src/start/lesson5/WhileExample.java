package start.lesson5;

public class WhileExample {
    public static void main(String[] args) {
        int zxc = 1000;
        while(zxc > 0){
            System.out.println(zxc);
            zxc -= 7;
        }
        while(true){
            zxc += 7;
            System.out.println(zxc);
            if(zxc == 1000)
                break;
        }
    }
}
