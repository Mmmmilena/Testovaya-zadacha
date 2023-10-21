public class test4 {
    public static void main(String[] args) {
        int [] a = {5,3,6,7,8};
        int b = 6;
        System.out.println(abc(a,b));
        cdf(a);

    }

   public static boolean abc (int[] a, int b) {
       for (int i = 0; i < a.length; i++) {
           if (a[i] == b) {
               return true;
           }

       }
       return false;

   }
   public static void cdf (int[] a) {
        int max = a[0];
       for (int i = 1; i < a.length; i++) {
           if (a[i] > max) {
               max = a[i];

           }
       }
       System.out.println(max);
   }
}
