package day7;
//Accessible from anywhere (same class, same package, different package).
public class publicClass {
    public String name;
    private double salary;   // hidden data

    public void show() {
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        publicClass p = new publicClass();
        p.name = "Shruti";
        // p.salary = 40000; // NOT allowed (private)
        p.show();   // accessible everywhere
    }
}
