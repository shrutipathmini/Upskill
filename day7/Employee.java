package day7;

public class Employee {
    int eid;
    String name;
    String job;
    double salary;

    void display() {
       System.out.println(eid); 
       System.out.println(name); 
       System.out.println(job); 
       System.out.println(salary); 
    }
    public static void main(String[] args) {
        Employee emp = new Employee();

        emp.eid = 1;
        emp.name = "Shruti";
        emp.job = "QA";
        emp.salary = 70000;

        emp.display();
    }
}