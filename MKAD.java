import java.util.Scanner;
public class MKAD {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int v = scanner.nextInt();
    int t = scanner.nextInt();
    System.out.println((109 + (v * t) %109)%109);
    }
}
