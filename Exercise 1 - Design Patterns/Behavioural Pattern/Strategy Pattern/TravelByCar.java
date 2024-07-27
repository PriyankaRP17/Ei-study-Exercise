public class TravelByCar implements Strategy {
    private static final double AVERAGE_SPEED = 100.0; // average speed in km/h

    @Override
    public double calculateTravelTime(double distance) {
        return distance / AVERAGE_SPEED;
    }
}
