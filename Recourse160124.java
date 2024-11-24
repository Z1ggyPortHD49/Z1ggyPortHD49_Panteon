import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.Scanner;

public class Recourse160124 {
    static int[][] array;
    static boolean[][] sm;
    static int[][] dp;
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileReader("input.txt"));
        array = new int[3][3];
        sm = new boolean[3][3];
        dp = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = scanner.nextInt();
            }

        }
        System.out.println(recourse(2, 2));
    }
    static int recourse(int x, int y) {

        if (x == 0 && y == 0)
            return array[x][y];
        if (x == -1 || y == -1)
            return Integer.MAX_VALUE;
        int a = recourse(x - 1, y);
        int b = recourse(x, y - 1);
        return array[x][y] + Math.min(a,b);
    }
    static int dp (int x, int y) {
        if (x == -1 || y == -1)
            return Integer.MAX_VALUE;
        if (sm[x][y])
            return dp [x][y];
        int a = dp(x, y - 1);
        int b = dp(x, y - 1);
        sm[x][y] = true;
        dp[x][y] = Math.min(a, b) + array[x][y];
        return dp[x][y];
    }
}
