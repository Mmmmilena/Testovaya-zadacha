package Lesson2;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        int a = 0;
       for (int i = 0;i <= 20;i++){
           if (i % 2 == 0)
               a += i;
       }
        System.out.println(a);
    }

}
