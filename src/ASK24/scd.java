package ASK24;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class scd {
    public static void main(String[] args) throws FileNotFoundException {
        String txt = new Scanner(new File("C:\\Users\\kraba\\Downloads\\24.txt")).nextLine();
        int maxLen = 0;

        // Ищем все позиции букв 'A' в строке
        for (int i = 0; i < txt.length(); i++) {
            if (txt.charAt(i) == 'A') {
                // Начинаем проверять возможные последовательности
                for (int j = i + 1; j < txt.length(); j++) {
                    if (txt.charAt(j) == 'A') {
                        // Проверяем, совпадают ли группы между A
                        String group = txt.substring(i + 1, j);
                        if (!group.contains("A")) {
                            // Проверяем продолжение последовательности
                            int currentLen = 2 + group.length(); // Длина A + group + A
                            int k = j + group.length() + 1;
                            while (k < txt.length() &&
                                    txt.charAt(k) == 'A' &&
                                    txt.substring(j + 1, k).equals(group)) {
                                currentLen += 1 + group.length(); // Добавляем A + group
                                j = k;
                                k = j + group.length() + 1;
                            }
                            if (currentLen > maxLen) {
                                maxLen = currentLen;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(maxLen);
        System.out.println('1');
    }
}