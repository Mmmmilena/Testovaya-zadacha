import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            int a = s.nextInt();
            if (a ==0) {
                break;
            }
            if (a> 0){
                System.out.println("Плюс");
            }
            else {
                System.out.println("Минус");
            }
        }


    }
}
