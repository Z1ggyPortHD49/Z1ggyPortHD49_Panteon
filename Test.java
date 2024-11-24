import java.sql.SQLOutput;

public class Test {
    public static void main(String[] args) {
        int n = 5;
        String emptyString = "";
        int[] array = new int[n];
        for(int i = 0; i < n; i++) {
        array[i] = i*3;
        }
        n = n%2;
        System.out.println(array[n]);
    }
}
