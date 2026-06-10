package day8;

public class VehicleMain {
    public static void main(String[] args) {
        Drivable car = new Car("Kia");
        Drivable bike = new Bike("Ymaha");
        Drivable truck = new Truck("Volvo");

        car.start();
        car.accelerate();
        car.brake();

        System.out.println("");

        bike.start();
        bike.accelerate();
        bike.brake();
        
        System.out.println("");

        truck.start();
        truck.accelerate();
        truck.brake();

    }
}