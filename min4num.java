import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class min4num {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(min(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
    }
    static int min(int a, int b, int c, int d) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(a);
        arrayList.add(b);
        arrayList.add(c);
        arrayList.add(d);
        Collections.sort(arrayList);
        return arrayList.get(0);
    }
}
