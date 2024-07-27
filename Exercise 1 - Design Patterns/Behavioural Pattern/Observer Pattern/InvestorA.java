public class InvestorA implements Observer {
    private String investorName = "Investor A";

    public void update(String stockName, double stockPrice) {
        System.out.println(investorName + " notified. " + stockName + " stock price changed to: " + stockPrice);
    }
}
