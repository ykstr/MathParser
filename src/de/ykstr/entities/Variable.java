package de.ykstr.entities;

public class Variable implements Calculatable{
    private char name;
    private double value;

    public double calculate(){
        return value;
    }
}
