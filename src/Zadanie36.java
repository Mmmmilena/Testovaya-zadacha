import java.util.Scanner;

public class Zadanie36 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String surname = s.nextLine();
        abc(surname);
    }
    public static void abc(String surname) {
        String surname1 = surname.substring(0,1).toLowerCase();
        String surmane2 = surname.substring(surname.length() - 1).toLowerCase();
        if (surname1.equals(surmane2)) {
            System.out.println("Одинаковые буквы");
        }
        else {
            System.out.println("Разные буквы");
        }
    }
}
