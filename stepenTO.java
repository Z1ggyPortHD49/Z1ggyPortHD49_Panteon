import java.util.Scanner;

public class stepenTO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(pow(scanner.nextDouble(), scanner.nextInt()));
    }
    static double pow(double b, double a) {
        return Math.pow(b,a);
    }
}
