package day9;

import java.io.FileWriter;
import java.io.IOException;

public class WriteCsv {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("test.csv");
        writer.append("Name, Age, Role\n");
        writer.append("Shruti, 33, QA\n");
        writer.append("Sham, 34, Support engg");

        writer.close();
    }
}