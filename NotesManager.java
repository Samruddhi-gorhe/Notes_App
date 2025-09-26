import java.io.*;
import java.util.Scanner;

public class NotesManager {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- Notes Manager ---");
            System.out.println("1. Create/Add notes to a file");
            System.out.println("2. Read notes from a file");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    addNotes();
                    break;
                case 2:
                    readNotes();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return; 
                default:
                    System.out.println("Invalid choice, try again!");
            }
        }
    }

    
    private static void addNotes() {
        System.out.print("Enter file name (without .txt): ");
        String fileName = sc.nextLine().trim() + ".txt";

        System.out.println("Enter your notes (type 'END' to finish):");
        try (FileWriter writer = new FileWriter(fileName, true)) { 
            while (true) {
                String line = sc.nextLine();
                if (line.equalsIgnoreCase("END")) {
                    break;
                }
                writer.write(line + System.lineSeparator());
            }
            System.out.println("Notes saved in " + fileName);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    private static void readNotes() {
        System.out.print("Enter file name to read (without .txt): ");
        String fileName = sc.nextLine().trim() + ".txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            System.out.println("\n--- Contents of " + fileName + " ---");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("-------------------------------");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
