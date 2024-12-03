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
        int S = scanner.nextByte(); //BackpackSize
        int N = scanner.nextInt(); //GoldenBars
        int wts[] = new int[N];
        for (int i = 0; i < N; i++) {
            wts[i] = scanner.nextInt();
        }
        System.out.println("Метод портфеля " + knapsnak(wts, S, N));
    }

    static int knapsnak(int weights[], int size, int bars) {
        int dp[][] = new int[size + 1][bars + 1];
        for (int i = 1; i <= bars; i++) {
            for (int j = 1; j <= size; j++) {
                if (weights[i - 1] <= j)
                    dp[j][i] = Math.max(dp[j][i - 1], dp[j - weights[i - 1]][i - 1] + weights[i - 1]);
                else dp[j][i] = dp[j][i - 1];
            }
        }
        return dp[size][bars];
    }
}
