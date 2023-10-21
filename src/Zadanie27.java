public class Zadanie27 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,7,1};
        System.out.println(abc(a));

    }
    public static boolean abc (int[] a) {
        for (int i = 0; i < a.length-1; i++) {
            if (a[i] < a[i+1]) {
                return true;
            }
        }
        return false;
    }
}
