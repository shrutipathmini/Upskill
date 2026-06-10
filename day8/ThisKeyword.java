package day8;

public class ThisKeyword {

    int x;
    int y;

    void setData(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void display() {
        System.out.println("Value of a = "+x +" Value of be = "+y);
    }
    public static void main(String[] args) {
        ThisKeyword tk = new ThisKeyword();
        tk.x = 10;
        tk.y = 20;
        tk.display();
    }
}