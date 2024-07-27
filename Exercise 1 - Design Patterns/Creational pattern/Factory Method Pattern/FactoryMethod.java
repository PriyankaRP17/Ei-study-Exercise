import java.util.Scanner;

public class FactoryMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the type of shape to draw (Circle/Rectangle): ");
        String shapeType = scanner.nextLine();

        // Get the shape object from the factory
        Shape shape = ShapeFactory.getShape(shapeType);

        // Draw the shape if it's valid
        if (shape != null) {
            shape.draw();
        } else {
            System.out.println("Invalid shape type. Please enter either 'Circle' or 'Rectangle'.");
        }

        scanner.close();
    }
}
