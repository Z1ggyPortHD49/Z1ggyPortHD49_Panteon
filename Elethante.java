import java.util.Scanner;

public class Elethante {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int d = s.nextInt();
        if(a == b && c == d)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
