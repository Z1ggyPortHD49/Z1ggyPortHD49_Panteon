import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ArrayVSCollections {
    public static void main(String[] args) {
        //Массивы быстрее, но требуют осторожности. Инициализация раз и навегда
        int [] array = new int[5];
        array[3] = 8;
        System.out.println(array[3]);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        //Быстрая инцилизация массива
        int [] array1 = {5, 7, -100, 1256};
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        //Коллекции имеют массу возможностей. Не требуют знания пащмепа при инцилизации.
        //Hast быстро находит находит наличие элемееиа в себе. Не записывает элемениы повторно.
        Set<String> set = new HashSet<>();
        set.add("5 и 5");
        Set<Integer> set1 = new HashSet<>();
        set1.add(5);
        //Как итерировать перечислить коллекции
        for (int a: set1) {
            System.out.println(a);
        }
        //HashMap имеет возможностбь называтся квартиры вместа номера индекса
        Map<String, Integer> map = new HashMap<>();
        map.put("Кв1", 55);
        map.put("Кв2", 102);
        for (int a: map.values()) {
            System.out.println(a);
        }
        System.out.println("Кв2");
    }
    {
    //static int F(int n) {
    //if (n % 2) {

        }
    }

