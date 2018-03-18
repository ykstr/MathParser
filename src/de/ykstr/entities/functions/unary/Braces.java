package de.ykstr.entities.functions.unary;

import de.ykstr.entities.Calculable;

public class Braces extends UnaryFunction {

    public Braces(Calculable inner) {
        super(inner);
    }

    public Braces(int inner) {
        super(inner);
    }

    public Braces(double inner) {
        super(inner);
    }

    @Override
    public StringPair getBoundaries() {
        return new StringPair("(",")");
    }

    @Override
    public double calculate() {
        return inner.calculate();
    }

    @Override
    public String toString() {
        return "("+inner.toString()+")";
    }
}
