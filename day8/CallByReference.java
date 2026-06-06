package day8;

public class CallByReference {
    public static void main(String[] args) {
        Test t1= new Test();

        t1.number2 = 120;
        t1.meth2(t1);
        System.out.println(t1.number2); //call by reference (Object)
    }
}