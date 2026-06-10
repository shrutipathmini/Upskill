package day8;

public class Car extends Vehicle implements Drivable {
    Car(String brand) {
        super(brand);
    }

    @Override
    public void start() {
        System.out.println(brand +" car starts with key/button");
    }
    
    @Override
    public void accelerate() {
        speed += 20;
        System.out.println(brand + " accelerates to "+ speed + "km/hr");
    }

    @Override
    public void brake() {
        speed -= 10;
        System.out.println(brand + " slows down to "+ speed + "km/hr");
    }
}