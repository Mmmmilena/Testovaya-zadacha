import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        if (number > 0) {
            System.out.println("Положительное");
        }
        else if (number < 0) {
            System.out.println("Отрицательное");
        }
        else if (number == 0) {
            System.out.println("Ноль");
        }
    }
}
