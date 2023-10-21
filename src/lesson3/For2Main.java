package lesson3;

public class For2Main {
    public static void main(String[] args) {

        OUTER:
        for (int i = 0; i <= 24; i++) {

            INNER:
            for (int j = 0; j <= 59; j++) {
                System.out.println("Час " + i + " минута " + j);
                if (j == 30) {
                    continue OUTER;
                }
                for (int k = 0; k <= 59; k++) {
                    System.out.println("Секунды");

                }
            }
        }
    }
}
