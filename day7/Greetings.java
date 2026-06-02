package day7;

public class Greetings {
    //1 no parameters, no value
    void disp() {
        System.out.println("Hello");
    }

    //2 no parameter, return value
    String returnMsg()
    {
        return("Hello how are you");
     }

     //Parameters, no return value
     void displayName(String name) {
        System.out.println("Name = " +name);
     }

     //parameters with return value
     String job(String job) {
        return("Job= "+job);
     }
}