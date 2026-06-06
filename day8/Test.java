package day8;

public class Test {
    int number = 1;

    void meth1(int number) {
        number = number + 1;
        System.out.println("Value of method ="+number);
    }

    int number2 = 2;

    void meth2(Test t) { //object as a variable
        t.number2 = t.number2 +1;
        System.out.println("Value in method = "+t.number2);
    }
}