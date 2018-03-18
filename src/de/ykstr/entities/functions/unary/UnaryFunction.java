package de.ykstr.entities.functions.unary;

import de.ykstr.entities.Calculable;
import de.ykstr.entities.variables.Variable;

public abstract class UnaryFunction implements Calculable {
    private Calculable inner;

    public UnaryFunction(Calculable inner){
        setInner(inner);
    }

    public UnaryFunction(int inner){
        setInner(new Variable(inner));
    }

    public UnaryFunction(double inner){
        setInner(new Variable(inner));
    }

    public Calculable getInner() {
        return inner;
    }

    public void setInner(Calculable inner) {
        this.inner = inner;
    }

    abstract public StringPair getBoundaries();

    @Override
    public void setVariable(String name, double value){
        inner.setVariable(name, value);
    }

    @Override
    public String toString() {
        return getBoundaries().getLeft()+inner.toString()+getBoundaries().getRight();
    }
}
