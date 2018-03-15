package de.ykstr.entities;

public class Variable implements Calculable {
    private char name;
    private Double value;

    public double calculate(){
        return value;
    }

    @Override
    public String toString() {
        return (value == null)? Character.toString(name):Double.toString(value);
    }
}
