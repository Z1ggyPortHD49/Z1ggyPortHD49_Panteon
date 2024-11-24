import java.util.Scanner;

public class NOH {
    public static void main(String[] args) {
        Scanner kakashka = new Scanner(System.in);
        int a = (kakashka.nextInt());
        System.out.println(a % 10 + (a / 10)%10 + (a / 100));
    }
}
