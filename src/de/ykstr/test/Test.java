package de.ykstr.test;

import de.ykstr.entities.*;
import de.ykstr.entities.functions.Plus;
import de.ykstr.parsing.MathParser;

public class Test{

    static final String TEST_EQUATION = "3+4*((2*3)-1)+x/2"; //25

    public static void main(String[] args) {
        System.out.println(TEST_EQUATION);
        Calculable c = MathParser.parse(TEST_EQUATION);
        System.out.println(c.toString()+" = "+c.calculate());

    }

}
