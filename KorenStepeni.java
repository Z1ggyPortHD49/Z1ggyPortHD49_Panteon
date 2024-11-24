public class KorenStepeni {
    public static void main(String[] args) {
        System.out.println(recourse(5));
    }

    static int recourse(int x) {
        if (x == 0)
            return 1;
        int y = recourse(x-1);
        return y*2;
    }
}
