package Lesson5;

public class MethodsUtils {
    public static void main(String[] args){
        print();
        int [] a = {43,43,43,43,434,3,4,};
//      int a =  summa(3,7,8);

      int b = 0;
      int c = b;


    }

  static void print(){
      System.out.println("Привет мир!");
   }
   static void sum(int a1,int b1,int c1){
      int sum = 0;
      sum = a1 + b1 + c1;
       System.out.println(sum);
   }
    static int summa(int a1,int b1,int c1){
        int sum = 0;
        sum = a1 + b1 + c1;
        return sum;
    }
}
