import java.util.Arrays;

/*public class Acomidation {
    import java.util.Arrays;

    public class Actomadations {
        public static void main(String[] args) {
            int[] number = {0, 1, 2, 3, 4, 5, 6};
            int k = 3;
            int accom[] = Arrays.copyOfRange(number, 0, k);
            while (accom != null) {
                System.out.println(Arrays.toString(accom));
                accom = getNextKAccomodation(k, number);
            }
        }
        static int[] getNextKAccomodation(int k, int[] number) {
            int n = number.length;
            int i = k;
            while (i < n && number[i] < number[k - 1])
                i++;
            if (i < n) {
                swap(number, i, k - 1);
            } else {
                reverse(number, k - 1);
                int j = k - 2;
                while (j >= 0 && number[i] > number[i + 1])
                    j--;
                if (j < 0)
                    return null;
                else {
                    i = n - 1;
                    while (i > j) {
                        if (j < 0) {
                            return null;
                        } else {
                            i = n - 1;
                            while (i > j) {
                                if (number[i] > number[j])
                                    break;
                                i++;
                            }
                        }
                    }
                }
            }
            return Arrays.copyOfRange(number, 0, k);
        }
    }
    //return Arrays.copyOfRange(number, 0, k);

}*/
