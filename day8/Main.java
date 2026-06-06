package day8;

class Animal{
    private String name;
    private String breed;

    public Animal(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }
    public void eat() {
        System.out.println(name+ " of breed " + breed +" eats food");
    }
}

class Dog extends Animal {
    
    public Dog(String name, String breed) {
        super(name, breed);
    }
    public void makeSound() {
        System.out.println("This animal barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog("Max", "labrador");
        d.eat();
        d.makeSound();
    }
}
