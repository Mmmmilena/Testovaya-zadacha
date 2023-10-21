import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        double start = 2;
        double end = 9;
        Scanner s =new Scanner(System.in);
        double volume = s.nextDouble();
        if(start <= volume && volume <= end ) {
            System.out.println(true);
        }
        else {
            System.out.println(false);

        }
    }
}
