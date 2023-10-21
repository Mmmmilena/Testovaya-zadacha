import java.util.Scanner;

public class Zadanie21 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum1 = 0;
        int sum2 = 0;
        while (true) {
            int number1 = s.nextInt();
            int number2 = s.nextInt();
            sum1 =sum1 + number1;
            sum2 = sum2 + number2;
            if (number1 == number2) {
                break;
            }
            System.out.println(sum1);
            System.out.println(sum2);


        }
    }
}
