package oop;

import java.util.Scanner;

public class DogTest {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        Dog someDog = new Dog();
        System.out.print("Introdu greutatea catelului:");
        someDog.size = reader.nextInt();
        System.out.print("Introdu de cate ori sa latre:");
        someDog.bark(reader.nextInt());
    }
}
