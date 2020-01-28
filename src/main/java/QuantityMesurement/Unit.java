package QuantityMesurement;

public enum Unit {

    FEET(12),
    INCH(1),
    YARD(36),
    CM(1/2.54);

    private double unitValue;

    Unit(double i) {
        unitValue = i;
    }
    public double getUnitValue() {
        return this.unitValue;
    }
}