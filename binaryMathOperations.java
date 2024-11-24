import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class binaryMathOperations {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader((System.in)));
        int a = Integer.parseInt(bufferedReader.readLine());
        System.out.println(String.format("%03d", Integer.parseInt(Integer.toBinaryString(a))));
        //System.out.println(Integer.parseInt(String.format("%03d", Integer.parseInt(Integer.toBinaryString(a))));
        System.out.println(Integer.toBinaryString(-a-1));
        String s = (Integer.toBinaryString(-a-1));
        System.out.println(Integer.parseInt("10", 3));
        System.out.println(Integer.parseInt("10", 16));
        System.out.println(Integer.toHexString(a));
        System.out.println(Integer.toString(10,16));
    }
}



















































































