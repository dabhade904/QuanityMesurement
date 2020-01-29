package QuantityMesurement;

public enum Unit {

    FEET(UnitType.LENGTH, 12),
    INCH(UnitType.LENGTH, 1),
    YARD(UnitType.LENGTH, 36),
    CM(UnitType.LENGTH, 1 / 2.54);

    public double unitValue;
    public UnitType unitType;

    Unit(UnitType unitType, double value) {
        this.unitType = unitType;
        this.unitValue = value;
    }
}