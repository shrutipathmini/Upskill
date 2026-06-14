package day9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadCsv {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("test.csv"));
        String line;

        while((line = reader.readLine()) != null) {
            String[] values = line.split(",");
            System.out.println(values[0] + " | " + values[1]);
        }
    }
}