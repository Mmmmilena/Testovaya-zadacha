package Lesson4;

public class MainMass {
    public static void main(String[] args) {
        int i;
        double a ;
        a = 2.0;
        i = 2;
        //Первый способ иницилизации массива
        int[] massInt = {4,5,6,7,8};
        //Второй способ иницилизации массива
        double[] massD = new double[5];
        massD[0] = 2.5;
        massD[1] = 5.7;
        massD[2] = 5.5;
        massD[3] = 8.5;
        massD[4] = 3.5;

        System.out.println(massD[0]);
        System.out.println(massD[1]);
        System.out.println(massD[2]);
        System.out.println(massD[3]);
        System.out.println(massD[4]);


//        System.out.println(massInt[4]);
//        System.out.println(massInt[2]);
    }
}
