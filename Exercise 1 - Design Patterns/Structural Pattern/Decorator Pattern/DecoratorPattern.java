import java.util.Scanner;

public class DecoratorPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Creating coffee with optional extras.");

        // Create a basic coffee
        Coffee coffee = new BasicCoffee();

        System.out.print("Do you want milk (yes/no)? ");
        String milkChoice = scanner.nextLine();
        if (milkChoice.equalsIgnoreCase("yes")) {
            coffee = new MilkDecorator(coffee);
        }

        System.out.print("Do you want sugar (yes/no)? ");
        String sugarChoice = scanner.nextLine();
        if (sugarChoice.equalsIgnoreCase("yes")) {
            coffee = new SugarDecorator(coffee);
        }

        // Print the final description and cost of the coffee
        System.out.println("Your coffee: " + coffee.getDescription());
        System.out.println("Total cost: $" + coffee.cost());

        scanner.close();
    }
}
