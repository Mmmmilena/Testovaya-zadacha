import java.util.Scanner;

public class Zadanie35 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        String surname = s.nextLine();
        abc(name, surname);
    }

    public static void abc(String name, String surname) {
        String name1 = name.substring(0,1).toLowerCase();
        String surname2 = surname.substring(0,1).toLowerCase();
        if (name1.equals(surname2)) {
            System.out.println("Одинаковые буквы");
        }
        else {
            System.out.println("Разные буквы");
        }

    }
}
