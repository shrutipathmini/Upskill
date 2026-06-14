package day9;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.*;

public class CSVReaderWithLoggin {
    private static final Logger logger = Logger.getLogger(CSVReaderWithLoggin.class.getName()); //logger creation, static - shared across all methods, final - cannot be reassigned

    static { // static block - used for setup/config
        try {
            // Log to file
            FileHandler fileHandler = new FileHandler("csv-errors.log", true); // creates file where log will be shared, true - dont overwrite old logs
            fileHandler.setFormatter(new SimpleFormatter()); // Defines log format (human-readable text format)
            logger.addHandler(fileHandler); //Connects logger → file output destination
            logger.setUseParentHandlers(false); // avoid console duplication - Disables default console logging
        } catch (IOException e) {
            System.out.println("Failed to initialize logger: " + e.getMessage());
        }
    }

    public static List<String[]> readCsv(String filePath, int expectedColumns) { // takes file path, takes expected column count, returns list of rows (List<String[]>)

        List<String[]> rows = new ArrayList<>(); //Stores valid CSV rows

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) { //Opens file safely - BufferedReader reads line by line efficiently - 

            String line;
            int lineNumber = 0;

            while ((line = reader.readLine()) != null) { //Reads file line-by-line - Stops when file ends (null)
                lineNumber++; // increment row counter for each line

                // Skip empty lines
                if (line.trim().isEmpty()) {
                    logger.warning("Empty line at: " + lineNumber);
                    continue;
                }

                String[] columns = line.split(","); //Splits line into columns using comma

                // Validate column count 
                if (columns.length != expectedColumns) { //Checks if row matches expected structure
                    logger.severe("Malformed row at line " + lineNumber +
                            " | Expected: " + expectedColumns +
                            " | Found: " + columns.length +
                            " | Data: " + line);
                    continue; // skip bad row
                }

                rows.add(columns); //Only valid rows are stored in result list
            }

        } catch (FileNotFoundException e) {
            logger.severe("CSV file not found: " + filePath);

        } catch (IOException e) {
            logger.severe("Error reading CSV: " + e.getMessage());
        }

        return rows;
    }

    // Test run
    public static void main(String[] args) {

        List<String[]> data = readCsv("data.csv", 3);

        for (String[] row : data) {
            System.out.println(Arrays.toString(row));
        }
    }
}