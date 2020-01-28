package QuantityMesurement;

public class QuantityMeasurement {

    Unit unit;
    double measure;

    public QuantityMeasurement(Unit unit, double measure) {
        this.unit = unit;
        this.measure = measure;
    }

    public double convertor(QuantityMeasurement measurement) {
        double unitValue = measurement.unit.getUnitValue();
        return Math.round(measurement.measure * unitValue);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement that = (QuantityMeasurement) o;
        double value1 = convertor(this);
        double value2 = convertor(that);
        System.out.println(value1 + "   " + value2);
        if (measure == 0 && that.measure == 0)
            return true;
        if (value1 == value2)
            return true;
        return Double.compare(that.measure, measure) == 0 &&
                this.unit == that.unit;
    }

    public double getAddition(QuantityMeasurement second) {
        double value1 = convertor(this);
        double value2 = convertor(second);
        return value1 + value2;
    }
}
