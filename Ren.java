import java.util.ArrayList;
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
            if (array[i] < array[i - 1] && array[i] < array[i + 1] && array[i - 1] == array[i + 1])
                arrayList.add(i);
        }
        System.out.println(arrayList);
        /*for (int i = 0; i < n; i++) {5 1 2 3 2 1
0
0
0
            array[i] = scanner.nextInt();
        }*/
        //5 1 2 3 2 1
        for (int i = 0; i < arrayList.toArray().length; i++) {
            System.out.println(valley(arrayList.get(i)));
        }
        System.out.println(palCheck(array));
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
