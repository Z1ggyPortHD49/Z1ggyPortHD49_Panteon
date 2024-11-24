import jdk.dynalink.beans.StaticClass;

import java.util.Scanner;

public class TestAlg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextInt();
        long c = scanner.nextInt();
        System.out.println(gcd(a, c));
        System.out.println(lcm(a,c));
        //System.out.println(numberOfDividers(a));
        /*String b = scanner.nextLine();
        System.out.println(trueORFalseMethendrom(b));*/
    }
        static int numberOfDividers (int a) {
        {
            a = Math.abs(a);
            if (a < 3)
                return a;
            int counter = 2;
            for (int i = 2; i < Math.sqrt(a); i++)
            {
                counter +=2;
            }
            return Math.sqrt(a)%1 == 0 ? counter + 1 : counter;
        }
    }
    static boolean trueORFalseMethendrom(String palindrom)
    {
        StringBuffer rev = new StringBuffer(palindrom).reverse();
        String strRev = rev.toString();
        if (palindrom.equalsIgnoreCase(strRev))
            return true;
        return false;
    }
    static long gcd(long a, long b)
    {
        return b == 0 ? a : gcd(b, a % b);
    }
    static long lcm(long a, long b)
    {
        return a * b/ gcd(a,b);
    }
}
