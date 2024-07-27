class StatusCommand implements SatelliteCommand {
    @Override
    public void execute(Satellite satellite) {
        System.out.println("Orientation: " + satellite.getOrientation());
        System.out.println("Solar Panels: " + satellite.getSolarPanels());
        System.out.println("Data Collected: " + satellite.getDataCollected() + " units");
    }
}
