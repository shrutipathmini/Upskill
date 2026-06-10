package day8;

public class Vehicle {
    String brand;
    int speed;

    Vehicle(String brand) {
        this.brand = brand;
        this.speed = 0;
    }

    void fuel() {
        System.out.println("Most vehicles use fuel or electricty");
    }
}