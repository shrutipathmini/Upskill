package day7;

public class GreetingsMain {
    public static void main(String[] args) {
        Greetings gr = new Greetings(); //object of greetings class
        gr.disp();
        String s = gr.returnMsg(); //In method only returning value, so printing it here
        System.out.println(s);
        //System.out.println(gr.returnMsg()); // another way to print

        gr.displayName("Shruti");

        String j = gr.job("QA");
        System.out.println(j);
    } 
}