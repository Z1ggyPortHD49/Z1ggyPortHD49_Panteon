import java.util.Scanner;

public class VinniThePuh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        //int z = 5;
        if ((x-y) % 5 == 0) {
            System.out.print(Math.abs(x-y)/5);
        }
        else {
            System.out.print(Math.abs(x-y)/5 + 1);
        }
    }
}
