package oop;

public class CarTest
{
    public static void main(String[] args) {
        Car audi = new Car(10,8,false);


        Car dacia = new Car(60,10,false);


        audi.start();
        System.out.println(audi.getFuel());
        System.out.println(audi.range());

        audi.drive(770);

        audi.wheels = 3;
        System.out.println(audi.wheels);
        System.out.println(dacia.wheels);


    }
}
