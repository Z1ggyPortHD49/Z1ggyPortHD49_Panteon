public class BublHlop { //bubbleSort
    static int counter = 0;
    public static void main(String[] args) {
        int[] testArr = new int[]{6,3,8,2,6,9,4,11,1};
        bubbleSort(testArr);
        for (int i : testArr) {
            System.out.println(i);
        }
        System.out.println("количевство изменений " + counter);
    }
    public static void bubbleSort(int[] array) {
        for (int i = array.length -1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j+1] ) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    counter++;
                    array[j+1] = temp;
                }
            }
        }
    }
}
