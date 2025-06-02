package ASK24;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class fst {
    public static void main(String[] args) throws FileNotFoundException {
        String txt = new Scanner(new File("C:\\Users\\kraba\\Downloads\\24.txt")).nextLine();
        txt = txt.replaceAll("[EF]", " ");
        int len = 0;
        int dumb = 0;
        for (int i = 1; i < txt.length(); i++) {
            if (txt.charAt(i) != ' ') {
                dumb++;
                len = Math.max(len, dumb);
            } else
                dumb = 0;
        }
        len = Math.max(len, dumb);
        System.out.println(txt);
        System.out.println(len);
    }
}
