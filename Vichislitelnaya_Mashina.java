import static java.lang.Math.sqrt;

public class Vichislitelnaya_Mashina {
    public static void main(String[] args) {
        for (double n = 1; n <= 100; n++) {
            if (Math.sqrt(n) * Math.sqrt(n + 1) == 0) {
                System.out.println(sqrt(n));
                n = Double.parseDouble(String.valueOf(n));
            } else
                n = Math.sqrt(n);
        }
    }
}
