package QuantityMesurement;

public class QuantityMeasurement {

    public Unit unit;
    public double measurement;

    public QuantityMeasurement(Unit unit, double measurement) {
        this.unit = unit;
        this.measurement = measurement;
    }

    public void convertor(QuantityMeasurement... measurement) throws MesurementException {
        if (measurement[0].unit.unitType != (measurement[1].unit.unitType)) {
            throw new MesurementException(MesurementException.Type.TYPE_MISMATCH);
        }
        measurement[0].measurement = (measurement[0].measurement * measurement[0].unit.unitValue);
        measurement[1].measurement = (measurement[1].measurement * measurement[1].unit.unitValue);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement that = (QuantityMeasurement) o;
        try {
            convertor(this, that);
        } catch (MesurementException e) {
        }
        return Double.compare(that.measurement, measurement) == 0;
    }

    public double getAddition(QuantityMeasurement that) throws MesurementException {
        convertor(this, that);
        return this.measurement + that.measurement;
    }
}
