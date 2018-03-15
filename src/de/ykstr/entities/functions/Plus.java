package de.ykstr.entities.functions;

import de.ykstr.entities.Function;

public class Plus extends Function {

    @Override
    public double calculate() {
        return left.calculate()+right.calculate();
    }
}