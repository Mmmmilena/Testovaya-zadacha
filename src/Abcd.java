public class Abcd {
    public static void main(String[] args) {

        int result= volumep(3,3,3);
        System.out.println(result);
        System.out.println(volumes(3.2));
    }
    public static int volumep(int a, int b, int c) {
       return a*b*c;


    }
    public static double volumes(double n) {
        return 4/3*Math.PI*Math.pow(n,3);
    }
}
