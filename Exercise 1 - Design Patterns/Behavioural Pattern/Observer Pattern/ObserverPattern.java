import java.util.Scanner;

public class ObserverPattern {
    public static void main(String[] args) {
        StockData stockData = new StockData();

        InvestorA investorA = new InvestorA();
        InvestorB investorB = new InvestorB();

        stockData.registerObserver(investorA);
        stockData.registerObserver(investorB);

        Scanner scanner = new Scanner(System.in);
        boolean continueUpdating = true;

        while (continueUpdating) {
            System.out.print("Enter stock name: ");
            String stockName = scanner.nextLine();
            System.out.print("Enter stock price: ");
            double stockPrice = scanner.nextDouble();
            scanner.nextLine(); // consume newline

            stockData.setStockPrice(stockName, stockPrice);

            System.out.print("Do you want to enter another stock update? (yes/no): ");
            String response = scanner.nextLine();
            continueUpdating = response.equalsIgnoreCase("yes");
        }

        scanner.close();
    }
}
