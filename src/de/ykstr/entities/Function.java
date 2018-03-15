package de.ykstr.entities;

public abstract class Function implements Calculable {
    protected Calculable left;
    protected Calculable right;

    @Override
    public String toString(){
        return left.toString()+ getOperator() +right.toString();
    }

    abstract public char getOperator();


}
