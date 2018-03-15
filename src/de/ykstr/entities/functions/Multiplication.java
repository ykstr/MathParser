package de.ykstr.entities.functions;

import de.ykstr.entities.Calculable;
import de.ykstr.entities.Function;

public class Multiplication extends Function {
    public Multiplication(Calculable left, Calculable right) {
        super(left, right);
    }

    public Multiplication(double left, double right) {
        super(left, right);
    }

    @Override
    public double calculate() {
        return left.calculate()*right.calculate();
    }

    @Override
    public char getOperator() {
        return '*';
    }
}
