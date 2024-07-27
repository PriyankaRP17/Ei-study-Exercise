import java.util.Scanner;

public class TravelTimeCalc {
    public static void main(String[] args) {
        Context context = new Context();
        Scanner scanner = new Scanner(System.in);

        boolean continueCalculating = true;

        while (continueCalculating) {
            System.out.println("Choose travel mode: 1) Car 2) Bike 3) Walking");
            int choice = scanner.nextInt();
            System.out.print("Enter distance (in km): ");
            double distance = scanner.nextDouble();

            switch (choice) {
                case 1:
                    context.setStrategy(new TravelByCar());
                    break;
                case 2:
                    context.setStrategy(new TravelByBike());
                    break;
                case 3:
                    context.setStrategy(new TravelByWalking());
                    break;
                default:
                    System.out.println("Invalid choice");
                    continue;
            }

            double travelTime = context.executeStrategy(distance);
            System.out.println("Estimated travel time: " + travelTime + " hours");

            System.out.print("Do you want to calculate for another distance? (yes/no): ");
            scanner.nextLine(); // consume newline
            String response = scanner.nextLine();
            continueCalculating = response.equalsIgnoreCase("yes");
        }

        scanner.close();
    }
}
