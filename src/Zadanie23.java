public class Zadanie23 {
    public static void main(String[] args) {
        int[] m = {1,2,3,4,5,4,4};
        int x = 4;
        System.out.println(abc(m,x));
    }

    public static int abc (int[] m, int x) {
        int count = 0;
        for (int i = 0; i < m.length; i++) {
            if (m[i] == x) {
                count++;
            }
        }
        return count;
    }
}
