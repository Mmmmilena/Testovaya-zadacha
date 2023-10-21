public class Zadanie26 {
    public static void main(String[] args) {
        int[] m = {1,2,3,4,5};
        int x = 10;
        System.out.println(abc(m,x));

    }
    public static boolean abc (int[] m, int x) {

        for (int i = 0; i < m.length-1; i++) {
            if (m[i] + m[i+1] == x) {
                return true;
            }
        }
        return false;
    }
}
