import java.util.Arrays;

public class Nuum1 {
    public static void main(String[] args) {
        Number num1 = new Number(16, true);
        System.out.println(num1.name + " " + num1.parity + " " + Arrays.toString(num1.dividors));
        }

    static public class Number {
        int name;
        boolean parity;
        int dividors [];

        public Number(int name, boolean parity) {
            this.name = name;
            this.dividors = dividors(name);
            this.parity = parity;

        }
        static public int[] dividors(int n) {
            int counter = 0;
            for (int i = 1; i <= Math.sqrt(n); i++) {
                if (n % i == 0)
                    counter += 2;
            }
            if (Math.sqrt(n) % 1 == 0)
                counter++;
            int [] div = new int[counter];
            for (int i = 1; i <= Math.sqrt(n); i++) {
                if (n % i == 0){
                    div[div.length - counter] = i;
                    counter--;
                    div[div.length - counter] = n / i;
                    counter--;
                }
            }
            Arrays.sort(div);
            return div;
        }
    }
}
