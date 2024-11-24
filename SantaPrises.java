import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SantaPrises {
    static int x, y, z;
    static Set<String> set = new HashSet<>();

    public static void main(String[] args) throws IOException {
        StreamTokenizer streamTokenizer = new StreamTokenizer(new FileReader("input.txt"));
        streamTokenizer.nextToken();
        x = (int) streamTokenizer.nval;
        streamTokenizer.nextToken();
        y = (int) streamTokenizer.nval;
        streamTokenizer.nextToken();
        z = (int) streamTokenizer.nval;
        streamTokenizer.nextToken();
        int w = (int) streamTokenizer.nval;
        recourse(w, "");
        System.out.println(recourse(w));
    }

    static int recourse(int w) {
        if (w == 0) {
            return 1;
        }
        if (w < 0) {
            return 0;
        }

        return recourse(w - x) + recourse(w - y) + recourse(w - z);
    }

    static void recourse(int w, String s) {
        if (w == 0) {
            set.add(s);
            return;
        }
        if (w < 0)
            return;
        String sI = s + "I";
        char[] i = sI.toCharArray();
        Arrays.sort(i);
        String si = new String(i);
        String sM = s + "M";
        char[] m = sM.toCharArray();
        Arrays.sort(m);
        String sm = new String(m);
        String sP = s + "P";
        char[] p = sP.toCharArray();
        Arrays.sort(p);
        String sp = new String(p);
        recourse(w - x, si);
        recourse(w - y, sm);
        recourse(w - z, sp);


    }
}
