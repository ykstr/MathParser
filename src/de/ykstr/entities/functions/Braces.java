package de.ykstr.entities.functions;

import de.ykstr.entities.Calculable;

public class Braces implements Calculable {
    private Calculable inner;

    @Override
    public double calculate() {
        return inner.calculate();
    }

    @Override
    public String toString() {
        return "("+inner.toString()+")";
    }
}
