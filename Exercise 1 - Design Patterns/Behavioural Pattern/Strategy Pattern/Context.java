public class Context {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public double executeStrategy(double distance) {
        return strategy.calculateTravelTime(distance);
    }
}
