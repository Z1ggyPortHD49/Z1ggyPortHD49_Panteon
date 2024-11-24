import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        //Считываем с консоли n - количество элементов в массивы
        int n = scanner.nextInt();
        //Объявляем и инциализируем массив величеной n
        int[] array = new int[n];
        //В цикле заполнием массив данными
        for (int i = 0; i < n; i++){
            array [i] = scanner.nextInt();
        }
        //Сортируем массив
        Arrays.sort(array);
        //В цинкле расспечатываем сортировать массив
        System.out.print("Сортированить по неубыванию массив   : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}