package Lesson8;

public class Person {
    String name;
    Car car;
    BankAccount bA;
    static int count = 0;

    Person(){
        count++;
    }
    static void dsd(){

    }

    void setName(String n){
        name = n;
    }
    void setCar(Car c){
        car = c;
    }
    void setBankAccount(BankAccount b){
        bA = b;
    }








    void  printInfo(){
        System.out.println("Меня зовут " + name  + " у моей машины цвет "
                + car.color + " мотор " + car.engine + " номер моего счета " + bA.idAccount + " на нем " + bA.accountMany );
    }

}

class  TestPerson{
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Petr";
        Wheel wheel = new Wheel(19,"michlen","Lipuchka");
        Car car = new Car("blue","V12",wheel);
        BankAccount bankAccount = new BankAccount(12345,5000);
        person.car = car;
        person.bA = bankAccount;
        Car car1 = new Car("red","V8",wheel);
        Person person1 = new Person();
        person1.setName("Ivan");
        person1.setCar(car1);
        BankAccount bankAccount1 = new BankAccount(1222,3000);
        person1.setBankAccount(bankAccount1);

        person.printInfo();
        System.out.println(Person.count);


    }
}
