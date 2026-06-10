package day8;

class Bike extends Vehicle implements Drivable {

    Bike(String brand) {
        super(brand);
    }

    @Override
    public void start() {
        System.out.println(brand + " bike starts with self/kick start");
    }

    @Override
    public void accelerate() {
        speed += 15;
        System.out.println(brand + " bike accelerates to " + speed + " km/h");
    }

    @Override
    public void brake() {
        speed -= 5;
        System.out.println(brand + " bike slows down to " + speed + " km/h");
    }
}