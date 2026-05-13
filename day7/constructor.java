package day7;

// public class constructor {
//     String name;
//     int age;

//     // Default constructor
//     // constructor() {
//     //     name = "Unknown";
//     //     age = 0;
//     // }

//     constructor(String name, int age) {
//         this.name = name;
//         this.age = age;
//     }

//     void display() {
//         System.out.println(name + " - " + age);
//     }

//     public static void main(String[] args) {
//         // constructor c1 = new constructor();  // constructor called automatically
//         // c1.display();

//         constructor c2 = new constructor("shruti", 33);  // constructor called with parameters
//         c2.display();


//     }
// }

//Constructor overloading
class constructor {
    String brand;
    int price;

    constructor() {
        brand = "Not Set";
        price = 0;
    }

    constructor(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    void details() {
        System.out.println(brand + " - " + price);
    }


    public static void main(String[] args) {
        constructor m1 = new constructor();
        constructor m2 = new constructor("Samsung", 25000);

        m1.details();
        m2.details();
    }
}