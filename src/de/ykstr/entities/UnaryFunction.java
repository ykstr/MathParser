package de.ykstr.entities;

public abstract class UnaryFunction implements Calculable{
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
}
