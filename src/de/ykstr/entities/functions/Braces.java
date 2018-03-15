package de.ykstr.entities.functions;

import de.ykstr.entities.BinaryFunction;
import de.ykstr.entities.Calculable;
import de.ykstr.entities.StringPair;
import de.ykstr.entities.UnaryFunction;

public class Braces extends UnaryFunction {
    private Calculable inner;

    public Braces(Calculable inner) {
        super(inner);
    }

    public Braces(int inner) {
        super(inner);
    }

    public Braces(double inner) {
        super(inner);
    }


    public Calculable getInner() {
        return inner;
    }

    public void setInner(Calculable inner) {
        this.inner = inner;
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
