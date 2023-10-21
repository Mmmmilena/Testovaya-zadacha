import java.util.Scanner;

public class Zaanie8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int grade = s.nextInt();
        if (2 <= grade && grade <= 5) {
            System.out.println("Верное значение");
        }
        else {
            System.out.println("Ошибочное значение");
        }
    }
}
