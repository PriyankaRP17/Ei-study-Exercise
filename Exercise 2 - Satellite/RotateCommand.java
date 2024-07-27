class RotateCommand implements SatelliteCommand {
    private String direction;

    public RotateCommand(String direction) { this.direction = direction; }

    @Override
    public void execute(Satellite satellite) {
        satellite.rotate(direction);
    }
}

