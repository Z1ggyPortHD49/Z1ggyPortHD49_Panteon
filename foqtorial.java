import javax.sound.midi.Soundbank;
import java.math.BigInteger;
import java.util.Scanner;

public class foqtorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(recourse(scanner.nextInt()));
    }

    static BigInteger recourse(int x) {
        if (x == 1 || x == 0)
            return BigInteger.ONE;
        BigInteger y = recourse(x - 1).multiply(BigInteger.valueOf(x));
        return y;
    }
}
