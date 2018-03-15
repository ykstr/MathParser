package de.ykstr.entities.functions;

import de.ykstr.entities.Calculable;

public class Braces implements Calculable {
    private Calculable inner;

    public Braces(Calculable inner){
        setInner(inner);
    }

    public Calculable getInner() {
        return inner;
    }

    public void setInner(Calculable inner) {
        this.inner = inner;
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
