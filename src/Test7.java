import java.util.Arrays;

public class Test7 {
    public static void main(String[] args) {
        int[] a = new int[20];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(a));
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i] +" ");
        }



    }
}
