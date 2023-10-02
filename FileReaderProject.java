import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.Scanner; // Import the Scanner class to read text files


public class FileReaderProject {
    public static void main(String[] args) {
        File file = new File("Input.txt");
        try {

            Scanner scanner = new Scanner(file);
            HashMap<String, Integer> map = new HashMap<>();

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");

                String name = parts[0];
                int age = Integer.parseInt(parts[1]);

                map.put(name, age);            
            }

            System.out.println(map.get("Ben"));
            System.out.println(map.get("Lydia"));


        } catch (FileNotFoundException e) {
            System.out.println("There was a file error!!!!");            
            e.printStackTrace();
        } catch (NoSuchElementException e) {
            System.out.println("There was a scanner error!!!");
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("There was a int parsing error error!!!");
            e.printStackTrace();
        }
    }
}