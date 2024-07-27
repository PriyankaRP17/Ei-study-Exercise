import java.util.Scanner;

public class SatelliteOrientation {
    public static void main(String[] args) {
        Satellite satellite = new Satellite();
        SatelliteController controller = new SatelliteController(satellite);
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.print("Enter command (rotate, activatepanels, deactivatepanels, collectdata, status, exit): ");
            String command = scanner.nextLine().trim().toLowerCase();

            if (command.equals("rotate")) {
                System.out.print("Enter direction (North, South, East, West): ");
                String direction = scanner.nextLine().trim();
                controller.setRotateDirection(direction);
            } else if (command.equals("exit")) {
                exit = true;
            } else {
                controller.handleCommand(command);
            }
        }
        scanner.close();
    }
}
