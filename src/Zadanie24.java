public class Zadanie24 {
    public static void main(String[] args) {
        int[] m = {1,2,3,4,5,6};
        int x = 7;
        System.out.println(abc(m,x));
    }
    public static boolean abc(int[] m, int x) {
        for (int a: m) {
            if (a == x)
                return true;
        }
        return false;
    }
}
