package Lesson8;

public class Car {
    String color;
    String engine;
    Wheel wheel;


    Car (){

    }
    Car(String c,String e,Wheel w){
        color = c;
        engine = e;
        wheel = w;
        System.out.println("Создался объект типа Car");
    }
    Car(String c){
        color = c;
    }

}

class TestCar{
    public static void main(String[] args) {
//        Car car1 = new Car("red","V8");
        Car car2 = new Car();
        Car car3 = new Car("red");
        car2.engine = "V22";

//        car1.color = "red";
//        car1.engine = "V8";
//        System.out.println(car1.color);
//        System.out.println(car1.engine);

    }
}
