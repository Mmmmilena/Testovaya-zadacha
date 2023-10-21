import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number1 = s.nextInt();
        int number2 = s.nextInt();
        if (number1 > number2) {
            int sum = number1 + number2;
            System.out.println(sum);
        }
        else if (number1 < number2) {
            int product = number1*number2;
            System.out.println(product);
        }
        else if (number1==number2) {
            System.out.println("Числа равны");
        }

    }
}
