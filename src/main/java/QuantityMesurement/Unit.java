package QuantityMesurement;

public enum Unit {

    FEET(UnitType.LENGTH, 12),
    INCH(UnitType.LENGTH, 1),
    YARD(UnitType.LENGTH, 36),
    CM(UnitType.LENGTH, 1 / 2.54),
    LITER(UnitType.LIQUID_WEIGHT, 1),
    GALLON(UnitType.LIQUID_WEIGHT, 3.78),
    ML(UnitType.LIQUID_WEIGHT, 0.001),
    KG(UnitType.SOLID_WEIGHT,1),
    GRAMS(UnitType.SOLID_WEIGHT,0.001),
    TON(UnitType.SOLID_WEIGHT,1000);

    public double unitValue;
    public UnitType unitType;

    Unit(UnitType unitType, double value) {
        this.unitType = unitType;
        this.unitValue = value;
    }
}