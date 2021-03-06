import QuantityMesurement.MesurementException;
import QuantityMesurement.QuantityMeasurement;
import QuantityMesurement.Unit;
import org.junit.Assert;
import org.junit.Test;

public class MeasurementAdditionTest {

    @Test
    public void givenTwoInchesValues_shouldReturnAdditionInInch() throws MesurementException {
        QuantityMeasurement first = new QuantityMeasurement(Unit.INCH, 2);
        QuantityMeasurement second = new QuantityMeasurement(Unit.INCH, 2);
        double addition = first.getAddition(second);
        Assert.assertEquals(4, addition, 0);
    }

    @Test
    public void given1FeetAnd2Inch_shouldReturnAdditionInInch() throws MesurementException {
        QuantityMeasurement first = new QuantityMeasurement(Unit.FEET, 1);
        QuantityMeasurement second = new QuantityMeasurement(Unit.INCH, 2);
        double addition = first.getAddition(second);
        Assert.assertEquals(14, addition, 0);
    }

    @Test
    public void given1FeetAnd1Feet_shouldReturnAdditionInInch() throws MesurementException {
        QuantityMeasurement first = new QuantityMeasurement(Unit.FEET, 1);
        QuantityMeasurement second = new QuantityMeasurement(Unit.FEET, 1);
        double addition = first.getAddition(second);
        Assert.assertEquals(24, addition, 0);
    }

    @Test
    public void given2InchAndCentimeter_shouldReturnAdditionInInch() throws MesurementException {
        QuantityMeasurement first = new QuantityMeasurement(Unit.INCH, 2);
        QuantityMeasurement second = new QuantityMeasurement(Unit.CM, 2.5);
        double addition = first.getAddition(second);
        Assert.assertEquals(3, addition, 0.03);
    }

    @Test
    public void given1GallonAnd3Liter780MilliLiter_shouldReturnAdditionInLiter() throws MesurementException {
        QuantityMeasurement first = new QuantityMeasurement(Unit.GALLON, 1);
        QuantityMeasurement second = new QuantityMeasurement(Unit.LITER, 3.78);
        double addition = first.getAddition(second);
        Assert.assertEquals(7.56, addition, 0);
    }

    @Test
    public void given1LiterAnd1000MilliLiter_shouldReturnAdditionInLiter() throws MesurementException {
        QuantityMeasurement first = new QuantityMeasurement(Unit.LITER, 1);
        QuantityMeasurement second = new QuantityMeasurement(Unit.ML, 1000);
        double addition = first.getAddition(second);
        Assert.assertEquals(2, addition, 0);
    }

    @Test
    public void given1TonAnd1000Grams_shouldReturnAdditionInKG() throws MesurementException {
        QuantityMeasurement kg = new QuantityMeasurement(Unit.TON, 1);
        QuantityMeasurement grams = new QuantityMeasurement(Unit.GRAMS, 1000);
        double addition = kg.getAddition(grams);
        Assert.assertEquals(1001, addition, 0);
    }

    @Test
    public void givenDiffrentTypeUnit_shouldReturnException() {
        try {
            QuantityMeasurement fahrenheit = new QuantityMeasurement(Unit.FAHRENHEIT, 212);
            QuantityMeasurement inch = new QuantityMeasurement(Unit.INCH, 100);
            double addition = fahrenheit.getAddition(inch);
        } catch (MesurementException e) {
            Assert.assertEquals(MesurementException.Type.TYPE_MISMATCH, e.type);
        }
    }
}
