public class Stepen {
    public static void main(String[] args) {
        System.out.println(recourse(32));
    }

    static int recourse(int x) {
        if (x == 1)
            return 1;
        int y = recourse(x/2);
        return y*2;
    }
}
