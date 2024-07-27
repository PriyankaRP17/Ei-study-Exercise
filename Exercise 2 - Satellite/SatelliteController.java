class SatelliteController {
    private Satellite satellite;
    private String rotateDirection = "North"; // Default direction

    public SatelliteController(Satellite satellite) { this.satellite = satellite; }

    public void setRotateDirection(String direction) { this.rotateDirection = direction; }

    public void handleCommand(String command) {
        switch (command.toLowerCase()) {
            case "rotate":
                new RotateCommand(rotateDirection).execute(satellite);
                break;
            case "activatepanels":
                satellite.activatePanels();
                break;
            case "deactivatepanels":
                satellite.deactivatePanels();
                break;
            case "collectdata":
                satellite.collectData();
                break;
            case "status":
                new StatusCommand().execute(satellite);
                break;
            default:
                System.out.println("Invalid command. Please try again.");
                break;
        }
    }
}
