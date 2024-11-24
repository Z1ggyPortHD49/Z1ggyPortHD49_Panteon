import java.math.BigInteger;
import java.util.Scanner;

public class bigInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger max  = BigInteger.ZERO;
        BigInteger x = scanner.nextBigInteger();
        BigInteger y = scanner.nextBigInteger();
        BigInteger z = scanner.nextBigInteger();
        if (x.compareTo(y) == 1)
            max = x;
        else
            max = y;
        if(z.compareTo(max) == 1)
            max = z;
        System.out.println(max);;
    }
}
