import java.io.*;
import java.util.Scanner;

public class sumssbrt {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int W = scanner.nextInt();
        int[] weights = new int[(int) Math.cbrt(W)];
        for (int i = 0; i < weights.length; i++) {
            weights[i] = (int) Math.pow(i + 1, 3);
        }
        System.out.println(knapsack1(weights, W));
    }
    
    static int knapsack1(int[] wts, int W) {
        int[] dp = new int[W + 1];
        dp[0] = 0;
        for (int i = 0; i < dp.length; i++) {
            dp[i] = i;
        }
        for (int w = 1; w <= W; w++) {

            for (int i = 0; i < wts.length; i++) {
                if (wts[i] <= w) {
                    dp[w] = Math.min(dp[w], dp[w - wts[i]] + 1);
                }
            }
        }
        return dp[W];
    }
}