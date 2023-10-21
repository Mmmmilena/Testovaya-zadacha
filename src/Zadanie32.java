import java.util.Scanner;

public class Zadanie32 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String surname = s.nextLine();
        abc(surname);

    }
    public static void abc(String a) {
        for (int i = 0; i < a.length(); i++) {
            char result = a.charAt(i);
            System.out.print(result + " ");

        }
    }
}
