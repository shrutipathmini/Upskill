package day7;

public class multipleObjects {
    String empName;
    int empId;

    multipleObjects(String empName, int empId) {
        this.empName = empName;
        this.empId = empId;
    }

    void display() {
        System.out.println("Employee name: "+ empName + ", employee Id : "+ empId);
    }

    public static void main(String[] args) {
        multipleObjects m1 = new multipleObjects("Shruti" , 1538);
        multipleObjects m2 = new multipleObjects("Sajna", 1529);
        multipleObjects m3 = new multipleObjects("Mini", 1540);

        m1.display();
        m2.display();
        m3.display();

        //public class - written in publicClass.java
        publicClass p1 = new publicClass();
        p1.name = "Shruti";
        p1.show();
    }
}