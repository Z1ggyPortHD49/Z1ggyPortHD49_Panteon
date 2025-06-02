package UGE5;

public class Five {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        F(12);
        for (int i = 0; i < 100000; i++) {
            if (F(i) < 199)
                max = Math.max(i, max);
        }
        System.out.println(max);
    }

    static int F(int N) {
        String R = Integer.toString(N, 3);
        char[] charN = R.toCharArray();
        if (N % 3 == 0)
            R = "1" + R + "02";
        else
            R = R + Integer.toString(N % 3 * 4, 3);
        return Integer.parseInt(R, 3);
    }
}
