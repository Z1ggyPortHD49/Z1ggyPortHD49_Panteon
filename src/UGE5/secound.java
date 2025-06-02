package UGE5;

import java.lang.reflect.Array;
import java.util.Arrays;

public class secound {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 10000; i++) {
            if (F(i) < 1200) {
                max = Math.max(F(i), max);
            }
        }
        System.out.println(max);
    }
    static int F(int N) {
        String s = Integer.toString(N, 3);
        char[] charN = s.toCharArray();
        String S = "";
        Arrays.sort(charN);
        for (int i = 0; i < charN.length; i++) {
            S = charN[i] + S;
        }
        S = S + S.charAt(0);
        return Integer.parseInt(S, 3);
    }
}
