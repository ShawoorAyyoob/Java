import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo {
    static final String FILE_NAME = " File.txt ";

    public static void main(String[] args) {
        writeToFile();
        readFromFile();
    }

    public static void readFromFile() {
        try {
            FileReader fileReader = new FileReader(FILE_NAME);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Error, while reading from files " + e.getMessage());
        }
    }

    public static void writeToFile() {
        try {
            FileWriter fileWriter = new FileWriter(FILE_NAME);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("New file being created...");
            bufferedWriter.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}