package day7;

public class Person {
    private String name;
    private int age;
    private String email;

    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getEmail() {
        return email;
    }
    public int setAge(int age) {
        if(age < 18) {
            System.out.println("Age should be greater than 18");
            // return age;
        }
        return this.age = age;
    }
    public String setEmail(String email) {
        if(!email.contains("@")) {
            System.out.println("Invalid email id");
            // return;
        } 
        return this.email = email;
    }
    public void displayInfo() {
        System.out.println("Name is "+name);
        System.out.println("Age is "+age);
        System.out.println("Email is "+email);
    }

}