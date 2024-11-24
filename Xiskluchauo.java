import java.util.Scanner;

public class Xiskluchauo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(xorbatiya(scanner.nextInt(), scanner.nextInt()));
    }
    static int xorbatiya(int a, int b) {
        return a^b;
    }
}
