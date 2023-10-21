import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        if (number < 0) {
            System.out.println(Math.pow(number,2));
        }
        else {
            System.out.println("Ошибка");
        }
    }
}

