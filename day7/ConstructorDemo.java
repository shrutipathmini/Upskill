package day7;

public class ConstructorDemo {
    int x,y;

    ConstructorDemo() { //default constructor
        x = 10;
        y = 20;
    }

    ConstructorDemo(int a, int b) { //Parameterized constructor
        x=a;
        y=b;
    }

    void sum() {
        System.out.println(x+y);
    }

    public static void main(String[] args) {
        ConstructorDemo dm = new ConstructorDemo();
        dm.sum();

        ConstructorDemo dm1 = new ConstructorDemo(200,300);
        dm1.sum();
    }
}