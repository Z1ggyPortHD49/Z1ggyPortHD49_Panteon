package UGE5;

import java.util.Arrays;

public class first {
    public static void main(String[] args) {
        for (int i = 1000; i < 10000; i++) {
            if (arteleriya(i).equals(String.valueOf(4343))) {
                System.out.println(i);
                break;
            }
        }
    }

    static String arteleriya(int a) {
        int square = 0;
        int[] arr = new int[4];

        char[] charA = String.valueOf(a).toCharArray();
        for (int i = 0; i < charA.length; i++) {
            if (charA[i] % 2 == 0) {
                square += charA[i] - 48;
            }
        }
        Arrays.sort(arr);
        square = (int) Math.pow(square, 2);
        Arrays.sort(charA);
        int cube = (int) Math.pow((charA[charA.length - 1]) - (charA[0]), 3);
        if (cube > square)
            return square + "" + cube;
        else
            return cube + "" + square;
    }
}
