public class FSStinse {
    public static void main(String[] args) {
        System.out.println(f(9996)-f(9994));
    }

    static int f(int n) {
        int x;
        if (n > 10000)
            return 42;
        if (n % 2 != 0 && n <= 10000)
            x =  -(n + f(n + 1) + f(n + 3));
        else
            x = 2 * n + f(n + 3) + f(n + 4) + f(n + 6);
        return x;
    }
}
