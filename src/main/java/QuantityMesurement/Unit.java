package QuantityMesurement;

public enum Unit {

    FEET {
        @Override
        public double convertor(double value) {
            return value * 12;
        }
    },
    INCH {
        @Override
        public double convertor(double value) {
            return value;
        }
    },
    YARD {
        @Override
        public double convertor(double value) {
            return value * 36;
        }
    };

    public abstract double convertor(double value);

}