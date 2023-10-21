import java.util.Scanner;

public class Zadanie14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int [] array = new int[size];
        for (int i = 0; i <= size; i++) {
            array[i] = (int) (Math.random() * 9999) + 1000;
        }
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }

    }
}
