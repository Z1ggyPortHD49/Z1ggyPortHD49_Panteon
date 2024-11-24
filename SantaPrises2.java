import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// 10, 25, 15, 40 - input.txt
// 6, 3, 3, 3
public class SantaPrises2 {
    StreamTokenizer streamTokenizer;
    int counter;
    ArrayList<Integer> arrayList;
    int x, y, z, w;

    Set<String> dp = new HashSet<>();
    Set<String> setDP = new HashSet<>();
    Set<String> set1 = new HashSet<>();
    Set<String> set = new HashSet<>();

    public static void main(String[] args) throws IOException {
        new SantaPrises2().solution();
    }

    void solution() throws IOException {
        streamTokenizer = new StreamTokenizer(new FileReader("input.txt"));
        int x = nextInt();
        int y = nextInt();
        int z = nextInt();
        int w = nextInt();
        run();
    }

    void run() {
        System.out.println("Это рекурсия считает все варианта как Дед Мороз кладет падарки " + recourse(w));
        recourse(w, "");
        //System.out.println("Это рекурсия кладет в Set уникальные комбицаии подарков" + set1.size());
        //recourseDP(w, "");
       // System.out.println("Это рекурсия не подходит для ветви деревьев, которые уже считались ранее: " + setDP.size());
        //cycle();
       // System.out.println("Это самый быстрой, но сложный алгоритм-формула: " + counter);
    }

    int recourse(int w) {
        if (w == 0) return 1;
        if (w < 0) return 0;
        return recourse(w - x) + recourse(w - y) + recourse(w - z);
    }

    void recourse(int w, String s) {
        if (w == 0) {
            char[] chatArray = s.toCharArray();
            Arrays.sort(chatArray);
            String s1 = new String(chatArray);
            set1.add(s1);
        }
        if (w < 0)
            return;
        recourse(w - x, s + "I");
        recourse(w - y, s + "M");
        recourse(w - z, s + "P");
    }

    void recourseDP(int w, String s) {
        if (dp.contains(s))
            return;
        if (w < 0)
            return;
        dp.add(s);
        if (w == 0) {
            setDP.add(s);
            return;
        }
        recourseDP(w - x, createString(s + "I"));
        recourseDP(w - x, createString(s + "I"));
        recourseDP(w - x, createString(s + "I"));
    }

    void cycle() {
        for (int i = 0; i * x <= w; i++) {
            for (int j = 0; j * y + i * x <= w; j++) {
                for (int k = 0; k * z + i * y + i * x <= w; k++) {
                    if (k * z + j * y + i * x == w)
                        counter++;
                }

            }
        }
    }

    void recourseMultiplicator(int multiplyX, int multiplyY, int multiplyZ) {
        if (multiplyX * x + multiplyY * y + multiplyZ * z == w) {
            set.add(String.valueOf(multiplyX) + String.valueOf(multiplyZ));
            return;
        }
        if (multiplyX * x + multiplyY * y + multiplyZ * z > w) {
            return;
        }
    }
    int nextInt() throws  IOException {
        streamTokenizer.nextToken();
        return (int)streamTokenizer.nval;
    }
    String createString(String s) {
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
}