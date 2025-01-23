package Ex1;
import java.util.Scanner;

public class DataEntry {
    public static void data_input(){
        // Try with resources. Requires the AutoCloseable interface to be implemented.
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please write your name, age and geographic area: ");
            String name = scanner.nextLine();
            int age = scanner.nextInt();
            // Clearing the /n
            scanner.nextLine();
            String geographic_area = scanner.nextLine();
            System.out.println(name + " " + age + " " + geographic_area + ".");
        }
    }
}