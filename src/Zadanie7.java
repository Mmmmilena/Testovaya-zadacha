import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        if (10 <= number && number <= 99) {
            int number1 = number / 10;
            int number2 = number % 10;
            if (number1 == number2) {
                System.out.println("Одинаковые цифры");
            }
        }
        else {
            System.out.println("Не одинаковые цифры");
        }

        }
}
