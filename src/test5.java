import java.util.Arrays;

public class test5 {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6,7,8};
        abc(a);

    }

    public static void abc (int[] a) {
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
            if (i % 2 !=0) {
                a[i] = 0;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
