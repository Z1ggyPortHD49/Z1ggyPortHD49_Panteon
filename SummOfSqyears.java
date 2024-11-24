

import java.util.Scanner;

public class SummOfSqyears {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int solution = 0;
        for (int i = 0; i <= n; i++)
            solution += i * i;
        System.out.println(solution);
    }
}