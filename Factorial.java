import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileReader("input.txt"));
        int n = scanner.nextInt();
        System.out.println(recourse(n));
    }
    static int recourse (int n) {
        if (n == 1) {
            return 1 ;
        }
        return n * recourse(n-1);
    }
}
