package de.ykstr.entities.functions;

import de.ykstr.entities.Calculable;
import de.ykstr.entities.BinaryFunction;

public class Minus extends BinaryFunction {
    public Minus(Calculable left, Calculable right) {
        super(left, right);
    }

    public Minus(double left, double right) {
        super(left, right);
    }

    @Override
    public double calculate() {
        return left.calculate()-right.calculate();
    }


    @Override
    public char getOperator() {
        return '-';
    }
}
