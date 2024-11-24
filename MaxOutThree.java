import java.util.Scanner;

public class MaxOutThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a > b && a > c)
            System.out.println(a);
        if (b > c && b > a)
            System.out.println(b);
        if (c > b && c > a)
            System.out.println(c);
    }
}
