import java.util.Scanner;

public class Zadanie20 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int number;
        number= s.nextInt();
        int nextNumber = number + 1;
        int sum = 0;
        while (sum <= number * number) {
            System.out.println(nextNumber);
            sum = sum +nextNumber;
            nextNumber++;
        }

    }
}
