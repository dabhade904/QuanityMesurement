package QuantityMesurement;

import java.util.Objects;

public class LengthMesurement {
    public enum Unit{
        FEET,INCH
    }
    Unit unit;
    double measure;

    public LengthMesurement(Unit unit, double measure) throws MesurementException {
        try {
            this.unit = unit;
            this.measure = measure;
        }catch (NullPointerException n){
            throw new MesurementException(n.getMessage(),MesurementException.Type.NULL_VALUE);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LengthMesurement that = (LengthMesurement) o;
        return unit == that.unit &&
                Objects.equals(measure, that.measure);
    }
}
