import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ren {
    static ArrayList<Integer> arrayList;
    static int[] array;

    //4 1 3 2 1 10 11 5 4 8 7 8
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int n = scanner.nextInt();
        arrayList = new ArrayList<>();
        array = new int[]{6, 5, 4, 5, 6, 11, 5, 4, 8, 7, 8};
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] < array[i - 1] && array[i] < array[i + 1])
                arrayList.add(i);
        }
        ArrayList<Integer> pak = new ArrayList<>();
        for (int i = 0; i < arrayList.toArray().length; i++) {
            pak.add(valley(arrayList.get(i)));
        }
        System.out.println(arrayList + " - Все ямы");
        System.out.println(palCheck(array) + " - Палиндромность");
        System.out.println(Collections.max(pak) + Collections.max(pak) - 1 + " - Максимальная палиндромная яма");
    }

    static boolean palCheck(int[] array) {
        int mid = array.length / 2;
        for (int i = 0; i <= mid; i++) {
            if (array[mid + i] == array[mid - i]) {
                return true;
            } else
                return false;
        }
        return true;
    }

    static int valley(int valley) {
        int counter = 0;
        try {
            for (int i = 0; i < array.length; i++) {
                if (array[valley + i] == array[valley - i])
                    counter++;
            }
        } catch (Exception e) {

        }
        return counter;
    }
}