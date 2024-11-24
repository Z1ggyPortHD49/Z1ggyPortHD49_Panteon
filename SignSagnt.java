import java.util.Scanner;

public class SignSagnt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a > 0 )
            System.out.println(1);
        if (a < 0 )
            System.out.println(-1);
        if (a == 0 )
            System.out.println(0);
    }
}
