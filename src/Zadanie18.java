import java.util.Scanner;

public class Zadanie18 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number;
        number = s.nextInt();
        while (number != 123) {
            System.out.println("Код неверный, повторите ввод");
            number = s.nextInt();
        }
            System.out.println("Код принят");

    }
}
