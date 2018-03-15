package de.ykstr.entities.functions;

import de.ykstr.entities.Calculatable;

public class Braces implements Calculatable{
    private Calculatable inner;

    @Override
    public double calculate() {
        return inner.calculate();
    }
}
