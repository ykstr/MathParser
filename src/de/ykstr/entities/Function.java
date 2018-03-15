package de.ykstr.entities;

public abstract class Function implements Calculable {
    protected Calculable left;
    protected Calculable right;

    public Function(Calculable left, Calculable right){
        setLeft(left);
        setRight(right);
    }

    /**
     * Convencience constructor for functions based on constant values rather then subfunctions
     * @param left
     * @param right
     */
    public Function(double left, double right){
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
    public String toString(){
        return left.toString()+ getOperator() +right.toString();
    }

}
