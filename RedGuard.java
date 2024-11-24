import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class RedGuard {
    static ArrayList<Integer> arrayList = new ArrayList<>();
    static int N = 0;
    static int[] buff;
    static int Energy = 0;

    // Enter -> 5 1 -1 2 1 3 3
    // Enter -> 5 -1 1 1 2 -2 3
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        buff = new int[N + 2];
        for (int i = 1; i < N + 1; i++) {
            buff[i] = scanner.nextInt();
        }
        Energy = scanner.nextInt();
        rec(0, Energy);
        Collections.sort(arrayList);
        System.out.println(arrayList.get(arrayList.size() - 1));
    }

    static void rec(int pos, int e) {
        if (pos == N + 1) {
            arrayList.add(e);
        }
        for (int i = 1; i <= Math.min(Energy, N + 1 - pos); i++) {
            rec(pos + i, e - i + buff[pos + i]);
        }
    }
}
