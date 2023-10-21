import java.util.Scanner;

public class Zadanie16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number;
        int count = 0;
        number = s.nextInt();
        while (number != 999) {
            count++;
            number = s.nextInt();
        }
        System.out.println(count);
    }

}
