public class HelpMePlease {
    public static void main(String[] args) {
        System.out.println(f(23) - f(21));
    }

    static int f(int n) {
        if (n >= 2025)
            return n;
        else
            return n + 3 + f(n + 3);
    }
}
