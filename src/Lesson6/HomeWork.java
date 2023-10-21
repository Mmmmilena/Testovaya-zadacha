package Lesson6;

import java.util.Arrays;

public class HomeWork {
    public static void main(String[] args) {
        String[] strings = {"image1.png", "image2.png", "image3.jpg", "image4.jpeg", "image5.png" };
        String[] strings1 =  getPicture(strings);
        for (int i = 0; i < strings1.length; i++){
            System.out.println(strings1[i]);
        }
    }
    //Написать метод который принимает массив, заполненный названием картинок с расширением например image.png image.jpg image.jpeg ,
    // метод должен вернуть новый массив строк заполненный только теми картинками которых больше  в массиве,
    // если картинок одинаковое количество то в равенстве png и jpg побеждает png в равенстве png и jpeg побеждает jpeg, в равенстве jpg и jpeg побеждает jpg.
    // Если jpeg и png и jpg равны возвращаем png.


    public static String[] getPicture(String[] array) {
        int countPng = 0;
        int countJpg = 0;
        int countJpeg =0;
        String[] resultArray = null;
        for (int i = 0; i < array.length; i++) {
            if (array[i].endsWith("png")) {
                countPng++;
            } else if (array[i].endsWith("jpg")) {
                countJpg++;
            } else if (array[i].endsWith("jpeg")) {
                countJpeg++;
            }
        }
        String[] arrJpeg = new String[countJpeg];
        String[] arrJpg = new String[countJpg];
        String[] arrPng = new String[countPng];
        //здесья пишу варианты сравнения каунтовых переменных
        for (int i = 0,j=0;i < array.length;i++) {
            if (countPng > countJpeg && countPng > countJpg) {
                if (array[i].endsWith(".png")){
                    arrPng[j] = array[i];
                    resultArray = arrPng;
                    j++;
                }
            } else if (countJpg > countPng && countJpg > countJpeg) {
                if (array[i].endsWith(".jpg")){
                    arrJpg[j] = array[i];
                    resultArray = arrJpg;
                    j++;
                }

            } else if (countJpeg > countPng && countJpeg > countJpg) {
                if (array[i].endsWith(".jpeg")){
                    arrJpeg[j] = array[i];
                    resultArray = arrJpeg;
                    j++;
                }
            }
        }
      return resultArray;
    }

}
