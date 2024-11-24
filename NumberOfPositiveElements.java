import java.util.Scanner;

public class NumberOfPositiveElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0)
                counter++;
        }
        System.out.println(counter);

    }
}
