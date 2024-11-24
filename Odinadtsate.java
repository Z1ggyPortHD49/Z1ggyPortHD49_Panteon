public class Odinadtsate {
    public static void main(String[] args) {
        System.out.println(F(4));
    }

    static float F(float n) {
        if (n <= 1)
            return 1;

        if (n > 1 && n % 2 != 0) {
            return 6*F(n-1);
        }
        return F(n - 1) / 3;
    }
}
