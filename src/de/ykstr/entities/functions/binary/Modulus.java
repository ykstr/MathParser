package de.ykstr.entities.functions.binary;

import de.ykstr.entities.Calculable;

public class Modulus extends BinaryFunction {

    public Modulus(Calculable left, Calculable right) {
        super(left, right);
    }

    public Modulus(double left, double right) {
        super(left, right);
    }

    @Override
    public double calculate() {
        return left.calculate()%right.calculate();
    }

    @Override
    public char getOperator() {
        return '%';
    }
}
