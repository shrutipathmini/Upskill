package day8;

class Truck extends Vehicle implements Drivable {

    Truck(String brand) {
        super(brand);
    }

    @Override
    public void start() {
        System.out.println(brand + " truck starts with heavy ignition system");
    }

    @Override
    public void accelerate() {
        speed += 10;
        System.out.println(brand + " truck accelerates to " + speed + " km/h");
    }

    @Override
    public void brake() {
        speed -= 8;
        System.out.println(brand + " truck slows down to " + speed + " km/h");
    }
}