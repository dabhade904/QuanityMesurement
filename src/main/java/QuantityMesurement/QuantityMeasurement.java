package QuantityMesurement;

public class QuantityMeasurement {

    public Unit unit;
    public double measurement;

    public QuantityMeasurement(Unit unit, double measurement) {
        this.unit = unit;
        this.measurement = measurement;
    }

    public void convertor(QuantityMeasurement... measurement) {
        for (int i = 0; i < measurement.length; i++) {
            System.out.println(measurement[i].measurement);
            measurement[i].measurement = (measurement[i].measurement * measurement[i].unit.unitValue);
            System.out.println(measurement[i].measurement);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement that = (QuantityMeasurement) o;
        if (this.unit.unitType != (that.unit.unitType)) {
            return false;
        }
        convertor(this, that);
        return Double.compare(that.measurement, measurement) == 0;
    }

    public double getAddition(QuantityMeasurement that) {
        convertor(this, that);
        return this.measurement + that.measurement;
    }
}
