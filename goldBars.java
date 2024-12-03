import java.util.Scanner;

public class goldBars {
    /*
    Enter
    10 3 5 7 4
    or
    10 3
    5 7 4
    Void
    9 */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short S = scanner.nextShort(); //BackpackSize
        short N = scanner.nextShort(); //GoldenBars
        int wts[] = new int[N];
        for (short i = 0; i < N; i++) {
            wts[i] = scanner.nextByte();
        }
        System.out.println(knapsnak(wts, S, N));
    }

    static int knapsnak(int weights[], short size, short bars) {
        int dp[][] = new int[size + 1][bars + 1];
        for (short i = 1; i <= bars; i++) {
            for (short j = 1; j <= size; j++) {
                if (weights[i - 1] <= j)
                    dp[j][i] = Math.max(dp[j][i - 1], dp[j - weights[i - 1]][i - 1] + weights[i - 1]);
                else dp[j][i] = dp[j][i - 1];
            }
        }
        return dp[size][bars];
    }
}
