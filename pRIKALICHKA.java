import java.util.Scanner;

public class pRIKALICHKA {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int anigilator123PVM1 = console.nextInt();
        int anigilator123PVM2 = console.nextInt();
        if (anigilator123PVM2 == 1) {
            System.out.println(anigilator123PVM1);
            System.exit(0);
        }
        int woldewn = anigilator123PVM1 / anigilator123PVM2;
        if (anigilator123PVM1 % anigilator123PVM2 == 0) {
            System.out.println(woldewn + anigilator123PVM2 -1);
            System.exit(0);
        }
        System.out.println(woldewn + anigilator123PVM2);
    }
}
