import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        int r = scanner.nextInt();
        int b = scanner.nextInt();
        r = r + b / 10;
        y = y + r / 10;
        System.out.println(y / 10);
    }
}
