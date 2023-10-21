package Lesson2;

public class MainSwitch {
    public static void main(String[] args) {
        double a = 20.5;
        double b = 20.3;
        double c = 20.8;
        double d = 20.7;

        switch ("Понедельник") {
            case "понедельник":
                System.out.println("Это двоечник");
                break;
            case "Вторник":
                System.out.println("Это троечник");
                break;
            case "Среда":
                System.out.println("Это хорошист");
                break;
            case "Четверг":
                System.out.println("Это отличник");
                break;
            default:
                System.out.println("Это не оценка");
        }
    }
}
