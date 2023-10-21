import java.util.Scanner;

public class Test13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();

        switch (number) {
            case 1:

            case 2:

            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("осень");
                break;

            default:
                System.out.println("это не месяц");
                break;


        }
    }
}
