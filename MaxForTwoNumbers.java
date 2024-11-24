import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class MaxForTwoNumbers {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileReader("C:\\Users\\pante\\IdeaProjects\\OlipPrograming\\src\\input.txt"));
         int a = scanner.nextInt();
         int b = scanner.nextInt();
         if (a > b) {
             System.out.println(a);
         }
        else {
            System.out.println(b);
         }
    }
}
