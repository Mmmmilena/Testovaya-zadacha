public class urok6 {
    int sum () {
        int result = 0;
        System.out.println(result);
        return result;
    }

    int sum (int a) {
        int result1 = a;
        System.out.println(result1);
        return result1;
    }
    int sum (int a, int b) {
        int result2 = a + b;
        System.out.println(result2);
        return result2;
    }
    int sum (int a, int b, int c) {
        int result3 = a + b +c;
        System.out.println(result3);
        return result3;
    }
    int sum (int a, int b, int c, int d) {
        int result4 = a + b +c + d;
        System.out.println(result4);
        return result4;
    }
    int sum ( int a, int b, int c, int d, int f) {
        int result5 = a + b +c + d + f;
        System.out.println(result5);
        return result5;
    }
static class  Summa{
    public static void main(String[] args) {
        urok6 u = new urok6();
        u.sum();
        u.sum(1);
        u.sum(2,3);
        u.sum(4,5,6);
        u.sum(7,8,9,10);
        u.sum(11,12,13,14,15);
    }
}

}
