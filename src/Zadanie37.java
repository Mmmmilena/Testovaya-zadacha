import java.util.Scanner;

public class Zadanie37 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String string = s.nextLine();
        System.out.println(abc(string));

    }
    public static int abc(String string) {
        int sum = 0;
        for (int i = 0; i < string.length(); i++) {
            char result = string.charAt(i);
            if (Character.isDigit(result)) {
                int chislo = Character.getNumericValue(result);
                sum = sum + chislo;
            }
        }
        return sum;

        }
    }

