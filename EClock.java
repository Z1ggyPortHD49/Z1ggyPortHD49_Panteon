import java.util.Scanner;

public class EClock {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.println( a % 1440  / 60  + " " + a % 60);
    }
}
