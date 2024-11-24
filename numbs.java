import java.util.Arrays;
import java.util.Scanner;

public class numbs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String miha = scanner.nextLine();
        String boria = scanner.nextLine();
        int n = scanner.nextInt();
        String arr[] = new String[n];
        for (int i = 0; i < n; i++) {
            if (n % 2 != 0) {
                if (i % 2 == 0)
                    arr[i] = miha;
                else
                    arr[i] = boria;
            } else {
                if (i % 2 == 0)
                    arr[i] = boria;
                else
                    arr[i] = miha;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
