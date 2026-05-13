package day7;
import java.util.*;

class classBasics {
    String brand;
    double price;

    classBasics(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    void display() {
        System.out.println(brand + " costs " + price);
    }
    public static void main(String[] args) {
    classBasics cb = new classBasics("honda", 3000);
    cb.display();
    }
}

