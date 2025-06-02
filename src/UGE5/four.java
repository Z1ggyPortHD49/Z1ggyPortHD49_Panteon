package UGE5;

import java.util.Arrays;

public class four {
    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < 1000; i++) {
            if (F(i) > 133) {
                min = Math.min(F(i), min);
            }
        }
        System.out.println(min);
    }

    static int F(int N) {
        String R = Integer.toString(N, 3);
        char[] charN = R.toCharArray();
        if (N % 3 == 0)
            R = R + charN[charN.length - 2] + charN[charN.length - 1];
        else R = R + Integer.toString(N % 3 * 5, 3);
        return Integer.parseInt(R, 3);
    }
}
