import java.util.Scanner;

public class scobki {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int counter = 0;
        boolean check = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 40 && check == false) {
                counter++;
                check = true;
            }
            else { //str.charAt(i) == 41 && check == true;
                counter--;
                check = false;
            }
        } //())(
        if (counter == 0 && check == false)
            System.out.printf("Ok");
        else
            System.out.printf("Not ok");
    }
}
