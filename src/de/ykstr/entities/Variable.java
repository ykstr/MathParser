package de.ykstr.entities;

public class Variable implements Calculable {
    private char name;
    private Double value;

    public Variable(double value){
        this.value = value;
    }

    public Variable(char name){
        this.name = name;
    }

    public char getName() {
        return name;
    }

    public void setName(char name) {
        this.name = name;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public double calculate(){
        return value;
    }

    @Override
    public String toString() {
        return (value == null)? Character.toString(name):Double.toString(value);
    }
}
