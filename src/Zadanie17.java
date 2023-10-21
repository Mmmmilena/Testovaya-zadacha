import java.util.Scanner;

public class Zadanie17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number;
        int count = 0;
        int sum = 0;
        number = s.nextInt();
        while (number != 999) {
            count++;
            sum = sum + number;
            number = s.nextInt();
        }
        System.out.println(count);
        System.out.println(sum);

    }
}
