import java.util.Scanner;

public class MaxOfThreeNumbers {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            if (a >= b && a >= c)
                System.out.println(a);
            else
                if (a <= b && b >= c)
                    System.out.println(b);
                else
                    if (a <= c && b <= c)
                        System.out.println(c);
                    else
                        if (a == b && b == c)
                            System.out.println(a);

        }
}
