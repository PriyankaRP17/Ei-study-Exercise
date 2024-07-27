import java.util.Scanner;

public class SingletonC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the singleton instance
        Singleton singleton = Singleton.getInstance();
        
        // Prompt user for input
        System.out.print("Enter a message to display with Singleton: ");
        String message = scanner.nextLine();

        // Display the message using the singleton instance
        singleton.showMessage(message);

        // Check if another instance can be created
        Singleton anotherSingleton = Singleton.getInstance();
        
        // Confirm both references are the same instance
        System.out.println("Are both references to the same instance? " + (singleton == anotherSingleton));

        scanner.close();
    }
}
