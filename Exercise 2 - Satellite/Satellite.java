import java.util.logging.Logger;

class Satellite {
    private static final Logger logger = Logger.getLogger(Satellite.class.getName());
    private String orientation = "North";
    private String solarPanels = "Inactive";
    private int dataCollected = 0;

    public Satellite() {
        logger.info(String.format("Satellite initialized with orientation %s, solar panels %s, and data collected %d units.",
                orientation, solarPanels, dataCollected));
    }

    public void rotate(String direction) {
        if (direction.matches("(?i)North|South|East|West")) {
            orientation = direction;
            logger.info(String.format("Satellite rotated to %s.", orientation));
        } else {
            logger.severe(String.format("Invalid direction: %s", direction));
            throw new IllegalArgumentException("Invalid direction. Use 'North', 'South', 'East', or 'West'.");
        }
    }

    public void activatePanels() {
        solarPanels = "Active";
        logger.info("Solar panels activated.");
    }

    public void deactivatePanels() {
        solarPanels = "Inactive";
        logger.info("Solar panels deactivated.");
    }

    public void collectData() {
        if (solarPanels.equals("Active")) {
            dataCollected += 10;
            logger.info(String.format("Data collected. Total data: %d units.", dataCollected));
        } else {
            logger.warning("Cannot collect data. Solar panels are inactive.");
        }
    }

    public String getOrientation() { return orientation; }
    public String getSolarPanels() { return solarPanels; }
    public int getDataCollected() { return dataCollected; }
}
