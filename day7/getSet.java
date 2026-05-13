package day7;

public class getSet {
    private String name; // private data
    //Getters and setters are used to access private variables safely (Encapsulation).

    void setName(String name) {
        this.name = name;
    }

    public String getName() { 
        return name;
    }

    public static void main(String[] args) {
        getSet gs = new getSet();
        gs.setName("shruti"); // set name
        System.out.println(gs.getName()); //get name 
    }
}