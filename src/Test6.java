import java.util.Arrays;

public class Test6 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = {0,2,3,4,5};
        abc(a,b);

    }
    public static void abc (int[] a, int[] b) {
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        int math = 0;
        for (int i = 0; i < a.length; i++) {
            math = math + a[i];
        }
        math = math / a.length;
        int math1 = 0;
        for (int i = 0; i < b.length; i++) {
            math1 = math1 + b[i];
        }
        math1 = math1 / b.length;

        if (math > math1) {
            System.out.println("А больше");
        }
        else {
            System.out.println("Б больше");
        }
    }
}
