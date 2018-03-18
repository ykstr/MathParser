package de.ykstr.entities;

public interface Calculable {
    public double calculate();
    public void setVariable(String name, double value);
    public void printTree(StringBuilder sb, int indent, boolean verbose);
}
