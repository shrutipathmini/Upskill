package day7;

public class Student {
    int studId;
    String studName;
    char grade;

    void printStudData () {
        System.out.println("ID = "+studId + ", Name = "+ studName + ", Grade = " + grade);
    }

    void setStudData(int id, String name, char grad) {
        studId=id;
        studName = name;
        grade = grad;
    }

    Student(int id, String name, char grad) { //constructor will never return a value
        studId = id;
        studName = name;
        grade = grad;
    }
}