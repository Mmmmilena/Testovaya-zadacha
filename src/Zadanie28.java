public class Zadanie28 {
    public static void main(String[] args) {
        int[] m = {1,2,3,4,5,6,1};
        int x = 3;
        System.out.println(abc(m,x));
    }
    public static boolean abc (int[] m, int x) {
        for (int i = 0; i < x - 1; i++) {
            if (m[i] < m[i+1]) {
                return false;
            }
        }
        return true;
    }
}
