package Lesson5;

public class MethodsUtils2 {

    public static void main(String[] args) {
        double srednee = sredneeArif(4,7,9);
        System.out.println(srednee);
        System.out.println(sredneeArif(4, 7, 9));
    }
                        //    5        5        7
    static double summa(int a,int b,int c){
        return a + b + c;
    }
    static double sredneeArif(int b1,int b2,int b3){
        double sum = summa(b1, b2, b3);

        return sum/3;
    }
}
