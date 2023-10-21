package Lesson4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestMain {
    public static void main(String[] args) {
        int[] ints = {3, 5, 6, 7, 8, 3, 2};
        System.out.println(Arrays.toString(ints));
        int[] newInts = removeElement(ints, 3);
        char[] chars = {'d','c','b','a'};
        int[] a1 = new int[] {21, 23, 24, 40, 75, 76, 78, 77, 900, 2100, 2200, 2300, 2400, 2500};
        int[] a2 = new int[] {10, 11, 41, 50, 65, 86, 98, 101, 190, 1100, 1200, 3000, 5000};
        sortUnsorted(a1,a2);
        insertionSort(ints);
        System.out.println(Arrays.toString(ints));
//        System.out.println(Arrays.toString(ints));
//        System.out.println(Arrays.toString(newInts));
        System.out.println(convect(71000, '$'));
    }

    public static int[] removeElement(int[] ints, int del) {
        int count = 0;

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] == del) {
                count++;
            } else {
                ints[i - count] = ints[i];
            }
        }
        int[] arr = new int[ints.length - count];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ints[i];
        }
        return arr;
    }
    private static void sortUnsorted(int[] a1,int[] a2) {
        int[] a3 = new int[a1.length + a2.length];

        int i=0, j=0;
        for (int k=0; k<a3.length; k++) {

            if (i > a1.length-1) {
                int a = a2[j];
                a3[k] = a;
                j++;
            }
            else if (j > a2.length-1) {
                int a = a1[i];
                a3[k] = a;
                i++;
            }
            else if (a1[i] < a2[j]) {
                int a = a1[i];
                a3[k] = a;
                i++;
            }
            else {
                int b = a2[j];
                a3[k] = b;
                j++;
            }
        }
    }
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while(j >= 0 && current < array[j]) {
                array[j+1] = array[j];
                j--;
            }
            // в этой точке мы вышли, так что j так же -1
            // или в первом элементе, где текущий >= a[j]
            array[j+1] = current;
        }
    }
    public static double convect(double a,char c){
        char EUR = '€';
        char USD = '$';
        char GBP = '£';
        double curseEuro = 82.65;
        double curseDollar = 71.29;
        double curseFunt = 95.65;
        double request = 0;

        if (c == EUR){
          request = a/curseDollar;
        }else if (c == USD){
            request = a/curseEuro;
        }else if (c == GBP){
            request = a/curseFunt;
        }else {
            System.out.println("Неизвестная валюта");
        }
        return request;
    }
    public  static int[] delete(int[] a, int b){
        int count = 0;

        for (int i = 0;i < a.length;i++){
            if (a[i] == b){
                count++;
            }else {
                a[i - count] = a[i];
            }
        }
        int[] newArray = new int[a.length -count];
        for (int i = 0;i < newArray.length;i++){
            newArray[i] = a[i];
        }
        return newArray;
    }


}