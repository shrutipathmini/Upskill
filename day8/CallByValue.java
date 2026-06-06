package day8;

public class CallByValue {
    public static void main(String[] args) {
        Test t = new Test();
        int num = 100;
        t.meth1(num);
    }
}