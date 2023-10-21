package Lesson4;

public class BubbleSortArray {
    public static void main(String[] args) {
        int[] massInt = {11, 3, 14, 16, 7};
        //3,7,11,14,16
        boolean isSort = false;
        int save = 0;

        while (!isSort) {
            isSort = true;
            for (int i = 0; i < massInt.length - 1; i++) {
                if (massInt[i] > massInt[i + 1]) {
                    isSort = false;
                    save = massInt[i];
                    massInt[i] = massInt[i + 1];
                    massInt[i + 1] = save;
                }
            }
        }

        for (int i = 0; i < massInt.length; i++) {
            System.out.println(massInt[i]);
        }

    }
}
