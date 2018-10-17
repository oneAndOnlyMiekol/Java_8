package l1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileCreator3 {
    public static void main(String[] args) {
        String fileName = "testFile.txt";
        
        try (
            FileReader fileReader = new FileReader(fileName);
            BufferedReader reader = new BufferedReader(fileReader);
        ) {
            String nextLine = null;
            int lines = 0;
            while ((nextLine = reader.readLine()) != null) {
                System.out.println(nextLine);
                lines++;
            }
            System.out.println("Iloœæ wierszy w pliku: " + lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}