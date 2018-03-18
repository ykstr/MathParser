package de.ykstr.entities.functions.unary;

import de.ykstr.entities.Calculable;
import de.ykstr.entities.variables.Variable;

public abstract class UnaryFunction implements Calculable {
    protected Calculable inner;

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
        if(inner != null){
            inner.setVariable(name, value);
        }else{
            System.out.println("Inner function is empty for: "+inner);
        }
    }

    @Override
    public void printTree(StringBuilder sb, int indent, boolean verbose) {
        for(int i = 0; i<indent; i++)sb.append(verbose?"\t":" ");
        if(verbose){
            sb.append(String.format("%s : %s%s%n",this.getClass().getSimpleName(),getBoundaries().getLeft(), getBoundaries().getRight()));
        }else{
            sb.append(getBoundaries().toString()+"\n");
        }

        for(int i = 0; i<indent+1; i++)sb.append(verbose?"\t":" ");
        if(verbose) {
            sb.append("inner:\n");
        }
        inner.printTree(sb,indent+1, verbose);
    }

    @Override
    public String toString() {
        return getBoundaries().getLeft()+inner.toString()+getBoundaries().getRight();
    }
}
