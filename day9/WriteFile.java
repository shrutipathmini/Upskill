package day9;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("test.txt"); //creates new file outside package folder
        writer.write("Hello QA Engineer");
        writer.close();
    }
}