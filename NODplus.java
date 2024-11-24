import java.util.Scanner;

public class NODplus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        System.out.println(gcd(a,b));
    }
    // Наибольшой общий кратнон Lower Common Multiple
        static long gcd(long a, long b)
         {
            return b == 0 ? a : gcd(b, a % b);
         }
}
