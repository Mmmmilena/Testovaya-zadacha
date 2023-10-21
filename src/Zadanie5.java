import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int students = s.nextInt();
        int chairs = s.nextInt();
        if (students <= chairs) {
            System.out.println("Стульев хватит"); }
        else{
                System.out.println("Стульев не хватит");
            }
        }
    }
