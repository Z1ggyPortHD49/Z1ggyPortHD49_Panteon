import java.util.Scanner;

public class OutputEvenElements {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array [i] = scanner.nextInt();
        }
        for (int i = 0; i < array.length; i++){
            if (array[i]%2 == 0)
                System.out.print(array[i] + " ");
        }

    }
}
