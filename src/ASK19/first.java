package ASK19;

public class first {
    public static void main(String[] args) {
        int Vmax = 0;
        for (int S = 1; S <= 300; S++) {
            if (F(S) % 2 == 0)
                Vmax = S;
        }
        System.out.println(Vmax);
    }

    static int F(int S) {
        if (S >= 342) {
            return 0;
        }
        return 1 + Math.min(F(S + 7), F(S * 3));
    }
}
