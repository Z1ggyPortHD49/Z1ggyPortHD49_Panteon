package UGE5;

import java.util.Arrays;

public class third {
    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < 1000; i++) {
            if (F(i) > 1799) {
                min = Math.min(F(i), min);
            }
        }
        System.out.println(min);
    }

    static int F(int N) {
        String R = Integer.toString(N, 12);
        if (N % 4 == 0)
            R = "2" + N + "64";
        else {
            char[] charN = R.toCharArray();
            Arrays.sort(charN);
            R = R + charN[charN.length - 1];
        }
        return Integer.parseInt(R, 12);
    }
}
