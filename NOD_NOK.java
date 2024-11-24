import java.util.Scanner;

public class NOD_NOK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        System.out.println(parse(gcd(a,b)));
    }
    static String parse(long a){
        String s = "";
        for (int i = 0; i < a; i++) {
            s += '1';
        }
        return s;
    }
    // Наибольшой общий кратнон Lower Common Multiple
    static long gcd(long a, long b)
    {
        return b == 0 ? a : gcd(b, a % b);
    }
    // Наименьшее общее кратное Lowest Common Multiple
    static long lcm(long a, long b)
    {
        return a * b/ gcd(a,b);
    }
}

