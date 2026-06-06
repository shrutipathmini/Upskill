package day8;

class fourLeg {
    void sound() { //type void- so no return type
        System.out.println("Animal makes sound");
    }
}

class dog extends fourLeg { //dog inherits all non private member of class fourleg
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Animals {
    public static void main(String[] args) {
        fourLeg an = new dog();  //upcasting - parent reference pointing to child object
        an.sound();
    }
}