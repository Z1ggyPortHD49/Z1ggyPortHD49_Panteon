import java.util.Scanner;

public class ChildElection {
    public static void main(String[] args) { //Make America great agean!
        Scanner scanner = new Scanner(System.in); // Khamala Horis is Damn
        System.out.println(WTFUCKINGVOITINGMAGAZINFORTRUMP(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
    }

    static int WTFUCKINGVOITINGMAGAZINFORTRUMP(int FK, int FM, int FY) {
        int counter = 0;
        int counter1 = 0;
        if (FK == 0)
            ++counter1;
        if (FM == 0)
            ++counter1;
        if (FY == 0)
            ++counter1;
        if (FK == 1)
            ++counter;
        if (FM == 1)
            ++counter;
        if (FY == 1)
            ++counter;
        if (counter1 > counter)
            return 0;
        else return 1;
    }
}
