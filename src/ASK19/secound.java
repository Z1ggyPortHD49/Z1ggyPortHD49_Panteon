package ASK19;

public class secound {
    public static void main(String[] args) {
        int Vmax = 0;
        for (int S = 1; S < 1000; S++) {
            if (S - 5 >= 0 && FinalMove(S) % 2 == 0)
                Vmax = S;
        }
        System.out.println(Vmax);
    }

    static int FinalMove(int S) {
        if (S <= 0) return 0;
        return 1 + Math.min(FinalMove(S - 5), FinalMove(S / 3));
    }
}
