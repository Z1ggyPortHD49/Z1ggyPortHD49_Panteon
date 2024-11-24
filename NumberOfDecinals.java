import java.util.Scanner;

public class NumberOfDecinals {
    public static void main(String[] args) {
        Scanner kakashka = new Scanner(System.in);
        int a = (kakashka.nextInt());
        System.out.println((a / 10)% 10);
    }
}
