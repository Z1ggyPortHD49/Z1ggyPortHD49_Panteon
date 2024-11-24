import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestSystemFirst {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        try {
            if (a != 1 && b != 1 || a == 1 && b == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
         catch (StringIndexOutOfBoundsException e) {
             System.out.println("NO");
        }
    }
}
