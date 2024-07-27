public class InvestorB implements Observer {
    private String investorName = "Investor B";

    public void update(String stockName, double stockPrice) {
        System.out.println(investorName + " notified. " + stockName + " stock price changed to: " + stockPrice);
    }
}
