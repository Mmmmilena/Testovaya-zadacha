import java.util.Scanner;

public class Zadanie19 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number;
        int sum = 0;
        int count = 0;
        while (sum < 150) {
            number = s.nextInt();
            sum = sum + number;
            count++;
        }
        System.out.println(count);
        System.out.println(sum);


    }
}
