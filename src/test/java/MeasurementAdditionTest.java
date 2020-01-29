import QuantityMesurement.QuantityMeasurement;
import QuantityMesurement.Unit;
import org.junit.Assert;
import org.junit.Test;

public class MeasurementAdditionTest {

    @Test
    public void givenTwoInchesValues_shouldReturnAdditionInInch() {
        QuantityMeasurement first = new QuantityMeasurement(Unit.INCH, 2);
        QuantityMeasurement second = new QuantityMeasurement(Unit.INCH, 2);
        double totalValue = first.getAddition(second);
        Assert.assertEquals(4, totalValue, 0);
    }

    @Test
    public void given1FeetAnd2Inch_shouldReturnAdditionInInch() {
        QuantityMeasurement first = new QuantityMeasurement(Unit.FEET, 1);
        QuantityMeasurement second = new QuantityMeasurement(Unit.INCH, 2);
        double totalValue = first.getAddition(second);
        Assert.assertEquals(14, totalValue, 0);
    }

    @Test
    public void given1FeetAnd1Feet_shouldReturnAdditionInInch() {
        QuantityMeasurement first = new QuantityMeasurement(Unit.FEET, 1);
        QuantityMeasurement second = new QuantityMeasurement(Unit.FEET, 1);
        double totalValue = first.getAddition(second);
        Assert.assertEquals(24, totalValue, 0);
    }

    @Test
    public void given2InchAndCentimeter_shouldReturnAdditionInInch() {
        QuantityMeasurement first = new QuantityMeasurement(Unit.INCH, 2);
        QuantityMeasurement second = new QuantityMeasurement(Unit.CM, 2.5);
        double totalValue = first.getAddition(second);
        Assert.assertEquals(3, totalValue, 0);
    }
}
