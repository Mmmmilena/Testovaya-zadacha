import java.util.Scanner;

public class Zadanie15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int [] array = new int[size];
        for (int i = 0; i < size;i++) {
            array[i] = (int) (Math.random() * 99) + 10;
        }
        for (int i = 0; i < size; i = i + 2) {
            System.out.println(array[i] + " ");
        }
        for (int i = 1; i < size; i = i + 2) {
            System.out.println(array[i] + " ");
        }


    }
}
