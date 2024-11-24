import java.util.Scanner;

public class TheNumberOfElementsLargerThanThePreviousOne {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int [] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }
            int counter = 0;
            for (int i = 1; i < array.length; i++) {
                if (array[i] > array[i - 1])
                    counter++;
            }
            System.out.println(counter);

        }
}

