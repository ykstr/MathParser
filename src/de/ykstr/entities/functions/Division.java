package de.ykstr.entities.functions;

import de.ykstr.entities.Function;

public class Division extends Function{

    @Override
    public double calculate() {
        return left.calculate()/right.calculate();
    }

    @Override
    public char getOperator() {
        return '/';
    }
}
