import java.util.Scanner;

public class Zadanie34 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        String surname = s.nextLine();
        abc(name, surname);
    }
    public static void abc(String name, String surname) {
        int name1 = name.length();
        int surname2 = surname.length();
        if (name1 > surname2) {
            System.out.println("Имя длиннее фамилии");
        }
        else if (name1 < surname2) {
            System.out.println("Имя короче фамилии");
        }
        else {
            System.out.println("Равны");
        }
    }
}
