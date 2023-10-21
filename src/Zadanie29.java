public class Zadanie29 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        System.out.println(abc(a));
    }
    public static int abc (int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        return sum;
    }
}
