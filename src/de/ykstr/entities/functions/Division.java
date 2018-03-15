package de.ykstr.entities.functions;

import de.ykstr.entities.Calculable;
import de.ykstr.entities.BinaryFunction;

public class Division extends BinaryFunction {

    public Division(Calculable left, Calculable right) {
        super(left, right);
    }

    public Division(double left, double right) {
        super(left, right);
    }

    @Override
    public double calculate() {
        return left.calculate()/right.calculate();
    }

    @Override
    public char getOperator() {
        return '/';
    }
}
