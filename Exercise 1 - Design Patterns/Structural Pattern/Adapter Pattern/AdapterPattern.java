import java.util.Scanner;

public class AdapterPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Using the Adapter Pattern:");

        // Create an instance of OldSystem
        OldSystem oldSystem = new OldSystem();
        Target adapter = new Adapter(oldSystem);

        System.out.println("Press Enter to perform the adapted operation.");
        scanner.nextLine(); // Wait for user input

        // Perform the operation using the adapter
        adapter.request();

        scanner.close();
    }
}
