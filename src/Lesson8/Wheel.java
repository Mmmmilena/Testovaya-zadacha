package Lesson8;

public class Wheel {
    int radius;
    String marka;
    String rezina;

    Wheel(int rad,String m,String r){
        radius = rad;
        marka = m;
        rezina = r;
        System.out.println("Создалось колесо " + radius + " " + marka + " " + " " + rezina );
    }

}
