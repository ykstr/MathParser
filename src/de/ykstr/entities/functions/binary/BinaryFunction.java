package de.ykstr.entities.functions.binary;

import de.ykstr.entities.Calculable;
import de.ykstr.entities.variables.Variable;

public abstract class BinaryFunction implements Calculable {
    protected Calculable left;
    protected Calculable right;

    public BinaryFunction(Calculable left, Calculable right){
        setLeft(left);
        setRight(right);
    }

    /**
     * Convencience constructor for functions based on constant values rather then subfunctions
     * @param left
     * @param right
     */
    public BinaryFunction(double left, double right){
        setLeft(new Variable(left));
        setRight(new Variable(right));
    }

    abstract public char getOperator();

    public void setLeft(Calculable left){
        this.left = left;
    }

    public void setRight(Calculable right){
        this.right = right;
    }

    public Calculable getLeft() {
        return left;
    }

    public Calculable getRight() {
        return right;
    }

    @Override
    public void setVariable(String name, double value){
        left.setVariable(name, value);
        right.setVariable(name, value);
    }

    @Override
    public String toString(){
        return left.toString()+ getOperator() +right.toString();
    }

}
