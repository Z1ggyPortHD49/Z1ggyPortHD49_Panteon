import java.io.IOException;
import java.util.Scanner;

public class A0A2A4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array [i] = scanner.nextInt();
        }
        for (int i = 0; i < array.length; i++){
           if (i % 2 == 0)
            System.out.print(array[i] + " ");
        }

    }
}
