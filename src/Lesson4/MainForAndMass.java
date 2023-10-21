package Lesson4;

public class MainForAndMass {
    public static void main(String[] args) {
        int[] massInt = new int[10];

        for (int i = 0,j = 5;i < 10;i++,j += 5){
            massInt[i] = j;
//            System.out.println(massInt[i]);
        }

        for (int i = massInt.length-1; i >= -1 ; i--){
            System.out.println(massInt[i]);
        }

    }
}
